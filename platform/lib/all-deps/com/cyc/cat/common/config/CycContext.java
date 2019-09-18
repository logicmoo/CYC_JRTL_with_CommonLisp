package com.cyc.cat.common.config;

import java.io.Serializable;

public class CycContext implements Serializable {
	
	public CycContext(String username, CycServer server) {
		this.username = username;
		this.server = server;
	}
  
  protected CycContext() {
		// Used by GWT's serialization mechanism
	}
	
	public static boolean isValidString(String string) {
		if (string != null) {
			final String tokens[] = string.split("@");
			if (tokens.length == 2) {
				return CycServer.isValidString(tokens[1]);
			}
		}
		return false;
	}
	
	public static CycContext fromString(String string) {
		final String tokens[] = string.split("@");
		return new CycContext(tokens[0], CycServer.fromString(tokens[1]));
	}
	
	
	// Public
	
	public String getUsername() {
    return username;
    }
	
	public CycServer getServer() {
    return server;
    }
	
	public void setProjectName(String projectName) {
    this.projectName = projectName;
    }

	public String getProjectName() {
    return projectName;
    }
	
	public boolean isDefined() {
		return (getUsername() != null) && (getServer() != null) && getServer().isDefined();
	}
	
	public boolean isDefinitionEqual(CycContext ctx) {
		if (isDefined() && (ctx != null) && ctx.isDefined()) {
			return getUsername().equals(ctx.getUsername()) && (getServer().equals(ctx.getServer()));
		}
		return false;
	}
	
	@Override
	public String toString() {
		return getUsername() + "@" + getServer();
	}
	
	
	// Internal rep
	
	private static final long serialVersionUID = 1L;
	private CycServer server;
	private String username;
	private String projectName;
}
