/*
 *  Copyright (C) 2010 Roderick Baier
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 */

package de.roderick.weberknecht;

import java.nio.charset.Charset;


public class WebSocketMessage
{
	private Byte[] message;


	public WebSocketMessage(final Byte[] message)
	{
		this.message = message;
	}


	public String getText()
	{
		byte[] message = new byte[this.message.length];
		for (int i = 0; i < this.message.length; i++) {
			message[i] = this.message[i];
		}
		return new String(message, Charset.forName("UTF-8"));
	}
	
	
	public Object getObject()
	{
		return null; // TODO implement
	}
}
