package xyz.kbws.maker.meta;

/**
 * @author kbws
 * @date 2024/11/10
 * @description:
 */
public class MetaException extends RuntimeException {
    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}
