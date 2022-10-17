package mementoresource;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class EmployeeManager{

	final Deque<EmployeeMemento> mementos = new ArrayDeque<>();
	public EmployeeMemento getMemento(){
		EmployeeMemento empMemento = mementos.pop();
			return empMemento;
	}
	
	public void addMemento(EmployeeMemento memento){
		mementos.push(memento);
	}
}
