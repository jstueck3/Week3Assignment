package Yahtzee;

public class YahtzeeHandGame
{
    private int threeKind;
    private int fourKind;
    private int fullHouse;
    private int yahtzee;
    private int TwoPair;
    private int onePair;
    private int oneOfKind;

    public YahtzeeHandGame(int i) {

    }

    //I then Created a getter/setter for member variables
    public int getThreeKind()
    {
        return threeKind;
    }

    public void setThreeKind(int threeKind)
    {
        this.threeKind = threeKind;
    }
    public int getFourKind()
    {
        return fourKind;
    }
    public void setFourKind(int fourKind)
    {
        this.fourKind = fourKind;
    }
    public int getFullHouse()
    {
        return fullHouse;
    }
    public void setFullHouse(int fullHouse)
    {
        this.fullHouse = fullHouse;
    }

    public int getYahtzee()
    {
        return yahtzee;
    }
    public void setYahtzee(int yahtzee)
    {
        this.yahtzee = yahtzee;
    }
    public int getTwoPair()
    {
        return TwoPair;
    }

    public void setTwoPair(int TwoPair)
    {
        this.TwoPair = TwoPair;
    }
    public int getOnePair()
    {
        return onePair;
    }
    public void setOnePair(int onePair)
    {
        this.onePair = onePair;
    }
    public int getOneOfKind()
    {
        return oneOfKind;
    }
    public void setOneOfKind(int oneOfKind)
    {
        this.oneOfKind = oneOfKind;
    }
}
