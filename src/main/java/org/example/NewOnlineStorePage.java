package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NewOnlineStorePage extends Util{

    private By _TitleText=By.xpath("//input[@class=\"enter-comment-title\"]");//path of title text box
    private By _CommentText=By.id("AddNewComment_CommentText");//path of comments text box
    private By _NEWCOMMENTBUTTON=By.xpath("//input[@value=\"New comment\"]");//path of new comment button
    private By _LeaveYourComment = By.xpath("//div[@class=\"fieldset new-comment\"]/div[1]/strong");//path of leave your comment
    String _ExpectedText="Leave your comment";
    private By _CommentsResult=By.xpath("//strong[text()=\"Anjli\"]");//path of comment result
    String _ExpectedComments="Anjli";
    private By _CommentResult1 =By.xpath("//p[text()=\"a1b2c3\"]");//path of comment result
    String _ExpectedComments2="a1b2c3";
    private  By _NewsCommentsSuccesMessage=By.xpath("//div[text()=\"News comment is successfully added.\"]");//path of success message
    String _ExpectedMessage="News comment is successfully added.";
//    public void verifyuserSeeComments(){
//        //verify actual comment with expected
//        Assert.assertEquals(getText1(_CommentsResult),_ExpectedComments);
//        Assert.assertEquals(getText1(_CommentResult1),_ExpectedComments2);
//    }
    public void VerifyUserInNewOnlineStorePage(){
        //verify actual comment with expected
        Assert.assertEquals(getText1(_LeaveYourComment),_ExpectedText);
    }
    public void  VerifyuserSeeSuccessfullyMessage(){
        //verify actual message with expected
        Assert.assertEquals(getText1(_NewsCommentsSuccesMessage),_ExpectedMessage);
    }

    public void VerifyUserEnterAllDetailsOfLeaveYourComment(){
        //type text in title and comment box
        typeText(_TitleText,"Anjli");
        typeText(_CommentText,"a1b2c3");
    }
    public void ClcikOnNewCommentButton(){
        //click on newcommentbutton
        clickonElement(_NEWCOMMENTBUTTON);
        List<WebElement> commentList = driver.findElements(By.xpath("//strong[@class=\"comment-text\"]"));
        String lastItem = commentList.get(commentList.size()-1).getText();
        Assert.assertEquals(lastItem,"Anjli");
    }
    }

