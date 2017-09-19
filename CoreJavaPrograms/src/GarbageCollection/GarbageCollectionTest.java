package GarbageCollection;

public class GarbageCollectionTest {
	static int j=0;

	public static void main(String[] args) {
		for(int i=1;i<1000;i++){
			GarbageCollectionTest gct = new GarbageCollectionTest();
			gct=null;
			System.out.println(i+" Objects created.");
		}
		String name = "Rajeev";
		String title = "Nayan";
		System.out.println("Name is : " +name+" "+title);
		System.out.println("HashCode of name and title are : " +name.hashCode()+" , "+title.hashCode()+"  respectively.");
		name=null;
		title=null;
		System.gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		j++;
		System.out.println("finalize() called.");
		System.out.println(j+" number of times finalized() called.");
		
	}

}
