package br.com.edu.resources;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

@Path("/upload")
public class UploadArquivoResource {

	
	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response upload(@FormDataParam("file")InputStream in,
						   @FormDataParam("file")FormDataContentDisposition info){
		
		try {
			
			Files.copy(in, new File( "c:\\dev\\"+ info.getFileName()).toPath());
			return Response.ok().build();
		} catch (IOException e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
		}
		
	}
}
