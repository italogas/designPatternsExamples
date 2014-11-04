package com.br.talogas.testproject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingUtilities;

public class testaVariasCoisas {
	
	static Integer[] fib_numbs = new Integer[20];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("\nSequencia de fibonnaci para n<=20: \n");
		for(int i = 0; i <20; i++){
			fib_numbs[i] = fib(i);
			//System.out.println("\t" + i + " : " + fib(i));
		}
		/*
		System.out.println("\nUsando fib_rec: \n");
		for(int i = 0; i <=20; i++){
			System.out.println("\t" + i + " : " + rec_fib(i));
		} */
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				criaGUI();
			}
		});
	}
	
	public static void criaGUI(){
		JFrame jf = new JFrame("Numeros de fibonacci!");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JList<JLabel> jList = new JList<JLabel>();
		jf.getContentPane().add(jList);
		
		JLabel jl;
		for(int i=0; i<fib_numbs.length; i++){
			jl = new JLabel(fib_numbs[i].toString());
			jList.add(jl);
		}
		
		jList.setVisible(true);
		
		jf.pack();
		jf.setVisible(true);
	}
	
	public static int fib(int n){
		int x = 0;
		int y = 1;
		int z;
		if(n==0){
			return x;
		} else {
			for(int i=1; i <= n-1; i++){
				z = x + y;
				x = y;
				y = z;
			}
		}
		return y;
	}
	
	public static int rec_fib(int n){
		if(n==0){
			return 0;
		} else if(n==1){
			return 1;
		} else {
			return rec_fib(n-2) + rec_fib(n-1);
		}
	}

}
