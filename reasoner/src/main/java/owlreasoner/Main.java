package owlreasoner;

import org.semanticweb.owlapi.apibinding.*;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.*;

public class Main {

    public static void main(String args[]) {
        ModelHandler handler=new ModelHandler("/home/adityas/Projects/Test_Reasoner/Reasoner/data/test.n3");
        handler.printClasses();
        handler.printOntology();
        OWLOntology onto=handler.getOntology();
        ReasoningModule rm=new ReasoningModule(onto);
        System.out.println(rm.getModelConsistency());
        //rm.printClassHeirarchy();
    }
}
