
package supalabact2.pkg3;

public class AdvancedTextEditor extends TextEditor{
    
    public AdvancedTextEditor (String text){
        super(text);
    }
    public void undo(){
        index--;
        setText(freshmilk[index]);
    }
    public void print(){
        System.out.println(getText());
    }
}
