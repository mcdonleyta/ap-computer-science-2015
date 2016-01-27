package items;

public abstract class Movie implements BetterGetter{

        private double rating;

        public double getRating() {return rating;}

        public int getBetter(Object otherO) {
                if(rating == ((Movie)otherO).getRating())
                        return 0;
                else if(rating > ((Movie)otherO).getRating())
                        return 1;
                else
                        return -1;
        }

        public Movie(double r) {
                rating = r;
        }

}
