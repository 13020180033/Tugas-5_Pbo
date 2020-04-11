class Coba {
   public static void main(String[] args) {
      System.out.println("starram\n");
      try{
         System.out.println(10/0);
      }
      catch(Throwable b) {
         System.err.println("terjadlahan >> "+b.getMessage());
      }
      finally {
         System.out.println("Pembagiann");
      }
      System.out.println("endrogram");
   }
}
