public class Users<T> implements Cloneable{
    private T userName;
    private T passWord;
    private T email;

    ///////////////////////////// constructor
    public Users () {}

    ///////////////////////////// setters $ getters
    public T getUserName() {
        return userName;
    }

    public void setUserName(T userName) {
        this.userName = userName;
    }

    public T getPassWord() {
        return passWord;
    }

    public void setPassWord(T passWord) {
        this.passWord = passWord;
    }

    public T getEmail() {
        return email;
    }

    public void setEmail(T email) {
        this.email = email;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
