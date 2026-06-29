package nivell01.exercici01;

public class NoGenericMethods {

    String elem01;
    String elem02;
    String elem03;

    public NoGenericMethods(String arg01, String arg02, String arg03) {
        this.elem01 = arg01;
        this.elem02 = arg02;
        this.elem03 = arg03;
    }

    public String getElem01() {
        return this.elem01;
    }
    public String getElem02() {
        return this.elem02;
    }
    public String getElem03(){
        return this.elem03;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s\n", this.elem01, this.elem02, this.elem03);
    }
}
