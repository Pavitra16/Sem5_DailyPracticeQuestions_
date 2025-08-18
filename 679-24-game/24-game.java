class Solution {
    private static double EPSILON = 0.1; 
    public boolean judgePoint24(int[] cards) {
        int n = cards.length;
        List<Double> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add( (double) cards[i]);
        }

        return solve( arr );
    }

    private boolean solve( List<Double> arr ) {
        if( arr.size() == 1 ){
            return Math.abs( arr.get(0) - 24 ) <= EPSILON;
        }

        for( int i = 0; i < arr.size(); i++ ) {
            for( int j = 0; j < arr.size(); j++ ) {
                if( i == j ) continue;

                List<Double> temp = new ArrayList<>();
                for( int k = 0; k < arr.size(); k++ ) {
                    if( k != i &&  k != j ) {
                        temp.add( arr.get(k) );
                    }
                }

                double a = arr.get(i);
                double b = arr.get(j);

                List<Double> possValues = new ArrayList<>();
                possValues.add( a + b );
                possValues.add( a - b );
                possValues.add( b - a );
                possValues.add( a * b );
                
                if( Math.abs(b) > 0.0 ) {
                    possValues.add( a / b );
                }
                if( Math.abs(a) > 0.0 ) {
                    possValues.add( b / a );
                }

                for(double val : possValues) {
                    temp.add( val ); 

                    if( solve( temp ) ) {
                        return true;
                    }
                    temp.remove( temp.size() - 1 );
                }

            }
        }

        return false;

    }
}