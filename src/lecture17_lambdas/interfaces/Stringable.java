package lecture17_lambdas.interfaces;

/**
 * Class Stringable
 *
 * Created by yslabko
 */
public interface Stringable {
    static boolean isEmpty(String str) {
        return str == null || ("".equals(str));
    }
}
