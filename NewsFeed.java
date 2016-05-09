import java.util.ArrayList;

/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
        photos = new ArrayList<>();
    }

    /**
     * Añade un mensaje al muro
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }

    /**
     * Añade un mensaje con foto al muro
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }

    /**
     * Muestra los mensajes del muro, primero muestra
     * los mensajes normales y luego los que tienen foto
     */
    public void show()
    {
        for(int i = 0; i < messages.size(); i++)
        {
            messages.get(i).display();
        }

        for(int i = 0; i < photos.size(); i++)
        {
            photos.get(i).display();
        }
    }
}
