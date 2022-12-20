package nestedInterface;

interface A {
	
	public B manage();
	
	interface B{
		
		public C window();
		
		interface C{
			
			public void maximize();
			
		}
		
	}

}
