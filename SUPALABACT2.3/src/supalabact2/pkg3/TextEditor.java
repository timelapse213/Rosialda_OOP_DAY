
package supalabact2.pkg3;


public class TextEditor {
    private StringBuilder text;
    int index = 0;
    String[] freshmilk = new String[6];
   
public TextEditor(String Text){
    this.text = new StringBuilder(Text);
    
    freshmilk[index] = Text;
    index++;
}

public String getText(){
    return this.text.toString();
}
public void setText(String text){
    this.text = new StringBuilder(text);    
    
}
public void append (String newText){
    freshmilk[index] = text.toString();
    index++;
    
    text.toString();
    this.text.append(newText);
}
public void delete(int n){
    
    freshmilk[index] = text.toString();
    index++;
    
   int milk = text.length();
   if(n <= 1){
       text.substring(1 - 1, milk);
       
   }
   
    
}

    
}
