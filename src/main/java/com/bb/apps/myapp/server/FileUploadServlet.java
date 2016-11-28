package com.bb.apps.myapp.server;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

public class FileUploadServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		
		   // Create a factory for disk-based file items
		   FileItemFactory factory = new DiskFileItemFactory();
		   // Create a new file upload handler
		   ServletFileUpload upload = new ServletFileUpload(factory);
		   try{
		         List items = upload.parseRequest(request); 
		         String user = request.getParameter("user");
		         
		         Iterator iter = items.iterator();

		         while (iter.hasNext()) 
		         {
		            FileItem item = (FileItem) iter.next();
		            if(item.isFormField()) {
		               System.out.println("Got a form field");
		               String name = item.getFieldName();
		               String value = item.getString();
		               System.out.print("Name:"+name+",Value:"+value);				
		            } 
		            else 
		            {
		               
		               String fileName = item.getName();
		               if (fileName != null) {
		                  fileName = FilenameUtils.getName(fileName);
		               }
		               String contentType = item.getContentType();
		               long sizeInBytes = item.getSize();
		               
		               System.out.println("File Name : "+fileName);
		               System.out.println("Content Type : "+contentType);
		               System.out.println("File Size : "+(sizeInBytes/1000)+" KB");

		               byte[] data = item.get();
		               
		               String extension = fileName.substring(fileName.lastIndexOf("."));
		               String uploadedFile = "";
		               
		               if(extension.equalsIgnoreCase(".doc"))
		            	  uploadedFile = getServletContext().getRealPath("/uploadedFiles/sampleFile.doc");
		               else if(extension.equalsIgnoreCase(".png"))
		            	   uploadedFile = getServletContext().getRealPath("/uploadedFiles/sampleFile.png");
		               
		               FileOutputStream fileOutSt = new FileOutputStream(fileName);
		               fileOutSt.write(data);
		               fileOutSt.close();
		               
		               System.out.println("File Uploaded Successfully!");
		               
		               SendEmailUtil.sendAnEmail(fileName);
		               
		               response.setStatus(HttpServletResponse.SC_CREATED);
		               response.getWriter().print("Success");
		               response.flushBuffer();
		            }	
		         }
		    } catch(Exception e){
		       System.out.println("File Uploading Failed!" + e.getMessage());
		       response.setStatus(HttpServletResponse.SC_CREATED);
               response.getWriter().print("Failure");
               response.flushBuffer();
		}

	}

}
