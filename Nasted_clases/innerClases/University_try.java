package Nasted_clases.innerClases;

public class University_try 
{
    public static void main(String[]Soylu)
    {
        University uni=new University();
        University.Engineering en=new University(). new Engineering();
        uni.name="Karabuk";
        en.engine();
        uni.accessEducation();
        
        //todo DENEMELER
        //! uni.code=20; olmuyooor iç sinifin özelliğine ulaşamaz
        en.code=80;
        //! uni.EducationObje().code=10; hocam eğer class private olmasayadı ulaşbilirdik. private olduğu için nesne cannot be visible oluyor
    }    
}