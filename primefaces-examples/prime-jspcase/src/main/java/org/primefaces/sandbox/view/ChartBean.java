/*
 * Copyright 2009 Prime Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.sandbox.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.sandbox.domain.Birth;
import org.primefaces.optimus.config.Scope;
import org.primefaces.optimus.config.annotations.Controller;

@Controller(name="chartBean", scope=Scope.VIEW)
public class ChartBean implements Serializable {

	private List<Birth> births;

	public ChartBean() {
		births = new ArrayList<Birth>();
		births.add(new Birth(2004, 120, 52));
		births.add(new Birth(2005, 100, 60));
		births.add(new Birth(2006, 44, 110));
		births.add(new Birth(2007, 150, 135));
		births.add(new Birth(2008, 125, 120));
	}
	public List<Birth> getBirths() {
		return births;
	}
}
