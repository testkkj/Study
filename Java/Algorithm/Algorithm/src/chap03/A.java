/**
 * A
 */
public class A implements Comparable<A> {

    @Override
    public int compareTo(A o) {
        //this가 c보다 크면 양의값
        //this가 c보다 작으면 음의값
        //this가 c와 같으면 0
        return 0;
    }
    
    public boolean equals(Object c) {
        //this가 c와 같으면 true
        //this가 c와 같지 않으면 false
        return false;
    }
}