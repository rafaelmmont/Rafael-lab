package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class ComparatorParImparImp<T> implements Comparator<Integer> {

	@Override
	public int compare(Integer arg1, Integer arg2) {
		// TODO Auto-generated method stub
		
		 if(arg1 > arg2) 
		     return 1;
		  else if(arg1 < arg2)
		     return -1;
		  else
		      return 0;
		
	}

}
