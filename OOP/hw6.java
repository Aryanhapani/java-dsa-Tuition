public class hw6 {
     public static void main(String[] args) {
        movie m1=new movie("ABC", "XYZ", "4 star");
        movie m2=new movie("fd", "rt", "5 star");
        movie m3=new movie("gh", "mnb", "5 star");
        movie m4=new movie("jkl", "sdb");

        movie[] arr={m1,m2,m3,m4};

       movie[] fivestr=m1.get5StarMovies(arr);
       for(movie fs:fivestr){
           if(fs!=null){
            fs.print();
           }
       }


        
     }
}
class movie {
        String title;
        String studio;
        String rating;

       public movie(String title,String studio,String rating){
         this.title=title;
         this.studio=studio;
         this.rating=rating;

       }

       public movie(String title,String studio){
         this.title=title;
         this.studio=studio;
         this.rating="5 star";
       }

       public movie[] get5StarMovies(movie[] movies){
           movie[] five_star=new movie[movies.length];
           int j=0;
           for(int i=0;i<movies.length;i++){
             if(movies[i].rating.equals("5 star")){
              five_star[j]=movies[i];
              j++;
             }
           }

           return  five_star;
       }

       public void print(){
        System.out.println(title);
        System.out.println(studio);
        System.out.println(rating);
       }



}
