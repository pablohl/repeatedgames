/*******************************************************************************
 * Copyright (c) 2011 Enrique Munoz de Cote.
 * repeatedgames is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * repeatedgames is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with repeatedgames.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Please send an email to: jemc@inaoep.mx for comments or to become part of this project.
 * Contributors:
 *     Enrique Munoz de Cote - initial API and implementation
 ******************************************************************************/
package util;


import java.util.Vector;
/**
 * @author aladdinagentschool
 * generic type actiondomain, can be implemented. It holds all the generic fields and methods common it its subclasses 
 */
public abstract class ActionDomain {
	public Vector<Object> actionSet;
	public Object getFirstAction(){
		return actionSet.firstElement();
	}
	
	public Vector<Object> getActionSet(){
		return actionSet;
	}
	
	public boolean contains(Object o){
		return actionSet.contains(o);
	}
}
