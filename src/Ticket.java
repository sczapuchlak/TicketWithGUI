
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sczapuchlak on 10/15/2016.
 */
public class Ticket {

    private int severityOfProblem;
    private String personWhoReported; //Stores person or department who reported issue
    private Date dateReported;
    private String descriptionOfProb;
    private String howWasItResolved = "none";

 //each ticket will have its own id number given by the counter
    public static int staticTicketIDCounter = 1;
    //The ID for each ticket - instance variable. Each Ticket will have it's own ticketID variable
    protected int ticketID;
    // format the date so it looks better and is easier to read
    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy @ hh:mm a");


    public Ticket(String description,int sev, Date date, String person,String resolution){
        this.descriptionOfProb = description;
        this.severityOfProblem = sev;
        this.dateReported = date;
        this.personWhoReported = person;
        this.howWasItResolved = resolution;
        this.ticketID = staticTicketIDCounter;

        staticTicketIDCounter++;
    }

    public static void setStaticTicketIDCounter(int staticTicketIDCounter) {
        Ticket.staticTicketIDCounter = staticTicketIDCounter;
    }

    //ticket with ID number set. Cant be set until now(After the counter has been set)
    public Ticket(int ID, String description, int sev, String person, Date date, String resolution) {
        this.descriptionOfProb = description;
        this.severityOfProblem = sev;
        this.dateReported = date;
        this.personWhoReported = person;
        this.howWasItResolved = resolution;
        this.ticketID = ID;

        staticTicketIDCounter++;
    }
//get and set what I need

    public void setHowWasItResolved(String resolution) {
        this.howWasItResolved = resolution;

    }

    public String toString() {
        return (this.ticketID + ";" + this.descriptionOfProb + ";" + (this.severityOfProblem + 1) + ";" +
                sdf.format(this.dateReported) + this.personWhoReported + ";" + ";" + howWasItResolved);
    }

    }

