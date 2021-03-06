/*
 * see license.txt 
 */
package harenet;

/**
 * Simple logging interface
 * 
 * @author Tony
 *
 */
public interface Log {

    public boolean enabled();
    public void setEnabled(boolean enable);
    
    public void debug(String msg);
    public void error(String msg);
    public void info(String msg);
}
