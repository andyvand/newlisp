//
//  MyFileFilter.java
//  guiserver
//
//  Created by Lutz Mueller on 5/21/07.
//
//
//    Copyright (C) 2015 Lutz Mueller
//
//    This program is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with this program.  If not, see <http://www.gnu.org/licenses/>.
//


import java.io.File;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.*;


public class MyFileFilter extends javax.swing.filechooser.FileFilter {

String extensions;
String description = null;

public boolean accept(File file)
	{
	String fileName = file.getName();
	String ext;
	
	StringTokenizer tokens = new StringTokenizer(extensions);
	
	while(tokens.hasMoreTokens())
		{
		ext = tokens.nextToken();
		if(fileName.endsWith(ext)) 
			return(true);
		
		if(file.isDirectory()) return(true);
		}
	
	return(false);
	}
	
public String getDescription() {
        return description;
    }
	

}
 
 
// eof //
