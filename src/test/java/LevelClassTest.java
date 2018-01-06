import fr.univtln.pathFinderTeam.classes.LevelClass;
import fr.univtln.pathFinderTeam.classes.Special;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by stephane on 08/12/17.
 */

public class LevelClassTest {

    private LevelClass levelClass;

    public static final int DEFAULT_LEVEL = 1;
    public static final String DEFAULT_NAME = "Mafenfe Vialllllaaaa";
    public static final int DEFAULT_WILL = 1;
    public static final String DEFAULT_DESCRIPTION = "Super descrpiton !";
    public static final int DEFAULT_BBA = 1;
    public static final int DEFAULT_REFLEX = 1;
    public static final int DEFAULT_VIGOR = 1;
    public static List<Special> DEFAULT_SPECIALS = new ArrayList();

    public static final String DEFAULT_SPECIAL_NAME = "Special name";
    public static final String DEFAULT_SPECIAL_DESCRIPTION = "OMG !";

    @BeforeEach
    public void init(){
        DEFAULT_SPECIALS.add(new Special(DEFAULT_SPECIAL_NAME, DEFAULT_SPECIAL_DESCRIPTION));

        levelClass = new LevelClass.Builder().setLevel(DEFAULT_LEVEL)
                .setName(DEFAULT_NAME)
                .setWill(DEFAULT_WILL)
                .setDescription(DEFAULT_DESCRIPTION)
                .setBBA(DEFAULT_BBA)
                .setReflex(DEFAULT_REFLEX)
                .setVigor(DEFAULT_VIGOR)
                .setSpecials(DEFAULT_SPECIALS)
                .build();
    }

    @Test
    public void isValidLevelClass(){
        //boolean isValid = levelClass.isValid();
        //assertEquals(isValid, true);
    }

}
