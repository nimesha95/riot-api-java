/*
 * Copyright 2016 Taylor Caldwell
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.rithms.riot.api.request;

import java.lang.reflect.Type;
import java.util.List;

import net.rithms.riot.api.HttpHeadParameter;

/**
 * The interface for objects that can be handled by
 * 
 * @author Daniel 'Linnun' Figge
 * @see AsyncRequest
 */
public interface RequestObject {
	
	public String getBody();
	
	public List<HttpHeadParameter> getHttpHeadParameters();
	
	public RequestMethod getMethod();

	public Type getReturnType();

	public String getUrl();
}