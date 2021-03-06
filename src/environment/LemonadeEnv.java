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
package environment;
import java.util.HashMap;
import java.util.Vector;

import util.ObservableEnvInfo;
import util.readxmlv2;


/*
 * subclass of environment, it can be implemented.
 * created a lemonade environment for the game
 */
public class LemonadeEnv implements Environment {
	
	// sets the lemonade environment
	public void setRewardCircle (int position, int reward){
		rewardCircle = new HashMap <Integer, Integer>();
		rewardCircle.put(position, reward);
	}
	
	public void init (){
		readxmlv2.getsteps();

	}

	@Override
	public void Init(Vector actions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ObservableEnvInfo currentEnvInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObservableEnvInfo nextEnvInfo(Vector actions) {
		// TODO Auto-generated method stub
		return null;
	}

}
