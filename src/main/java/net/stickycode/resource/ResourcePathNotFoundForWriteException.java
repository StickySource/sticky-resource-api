package net.stickycode.resource;

import java.io.FileNotFoundException;
import java.net.UnknownHostException;

import net.stickycode.exception.TransientException;

@SuppressWarnings("serial")
public class ResourcePathNotFoundForWriteException
    extends TransientException {

  public ResourcePathNotFoundForWriteException(FileNotFoundException e, ResourceLocation resourceLocation) {
    super(e, "Resource path {} is not writable or a parent path does not exist", resourceLocation.getPath());
  }

  public ResourcePathNotFoundForWriteException(UnknownHostException e, ResourceLocation resourceLocation) {
    super(e, "Resource path {} is not writable host not found", resourceLocation.getPath());
  }

}
