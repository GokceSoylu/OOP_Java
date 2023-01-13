package ExamQuestions;

public class StudentApp
{
    public static void main(String[] Soylu)
    {
        Student student1=new BachelourStudent(10, 50, 90);
        Student student2=new MasterStudent(10, 50, 90, 5);
        Student student3=new PhDStudent(10,50,90,2,1);

        //student1.projectScore(); 
       // System.out.println(((ConfaranceScoreBehavior)student3).conferanceScore()); 
        //((ArticleScoreBehavior)student2).articleScore(); 
        //student2.articleScore(); 
       ((ProjectScoreBehavior)student3).projectScore();
    }    
}
interface ArticleScoreBehavior
{
    float articleScore();
}
interface ConfaranceScoreBehavior
{
    float conferanceScore();
}
interface ProjectScoreBehavior
{
    float projectScore();
}
abstract class Student
{
    int id;
    float mid;
    float fin;
    Student(int id, float mid, float fin)
    {
        this.id=id;
        this.mid=mid;
        this.fin=fin;
    }
    abstract float computeTotalScore();
    float computeBaseScore(){
        return (float)0.4*mid+(float)0.6*fin;
    }
}
class BachelourStudent extends Student implements ProjectScoreBehavior
{
    BachelourStudent(int id, float mid, float fin)
    {
        super(id, mid, fin);
    }
    public float projectScore()
    {
        return 20;
    } 
    float computeTotalScore()
    {
        return computeBaseScore()+projectScore();
    }
}
class MasterStudent extends Student implements ConfaranceScoreBehavior
{
    int numberOfConferance;
    MasterStudent(int id, float mid, float fin, int numberOfConferance)
    {
        super(id, mid, fin);
        this.numberOfConferance=numberOfConferance;
    }
    float computeTotalScore()
    {
        return computeBaseScore()+conferanceScore();
    }
    public float conferanceScore()
    {
        return numberOfConferance*5;
    }
}
class PhDStudent extends MasterStudent implements ArticleScoreBehavior
{
    int numberOfArticle;
    PhDStudent(int id, float mid, float fin, int numberOfConferance, int numberOfArticle)
    {
        super(id, mid, fin, numberOfConferance);
        this.numberOfArticle=numberOfArticle;
    }
    public float articleScore()
    {
        return numberOfArticle*8;
    }
    float computeTotalScore()
    {
        return computeTotalScore()+computeBaseScore();
    }
}