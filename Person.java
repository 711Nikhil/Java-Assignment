public class Person {
    
  private String Title;
   // creates a private string named title

  private String Text;
  // creates a private string called text

   private String Author;
   // creates a private string called author
    
   private String Completiondate;
  // completion date called private string is created

   /**
    * Get the value of Completiondate
   *
    * @return the value of Completiondate
   */
   public String getCompletiondate() {
   return Completiondate;
   }

   /**
   * Set the value of Completiondate
   *
  * @param Completiondate new value of Completiondate
   */
   public void setCompletiondate(String Completiondate) {
   this.Completiondate = Completiondate;
    }

  /**
  * Get the value of Author
  *
 * @return the value of Author
 */
 public String getAuthor() {
 return Author;
 }

 /**
* Set the value of Author
  *
 * @param Author new value of Author
  */
  
   public void setAuthor(String Author) {
  this.Author = Author;
    }

   /**
  * Get the value of Text
 *
 * @return the value of Text
 */
    
   // getters and setters for text
  public String getText() {
  return Text;
   }

   /**
   * Set the value of Text
   *
   * @param Text new value of Text
   */
   public void setText(String Text) {
     this.Text = Text;
    }

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    
    // getters and setters for title
    public String getTitle() {
        return Title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.Title = title;
    }

  public Person(){
       
}
    }
