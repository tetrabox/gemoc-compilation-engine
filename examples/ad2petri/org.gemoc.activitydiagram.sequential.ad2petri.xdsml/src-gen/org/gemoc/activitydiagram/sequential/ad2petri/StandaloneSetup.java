package org.gemoc.activitydiagram.sequential.ad2petri;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	activitydiagram.ActivitydiagramPackage.eNS_URI,
    	activitydiagram.ActivitydiagramPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivitydiagramPackage.eNS_URI,
    	org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.ActivitydiagramPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor activityDiagram = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagram", "", "http://activitydiagram/1.0", "org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagram",
    	activityDiagram
    );
    MelangeRegistry.LanguageDescriptor activityDiagramToPetriNet = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramToPetriNet", "", "http://org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet/activitydiagram/", "org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramToPetriNetMT"
    );
    activityDiagramToPetriNet.addAdapter("org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT", org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramToPetriNetAdapter.class);
    activityDiagramToPetriNet.addAdapter("org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramToPetriNetMT", org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagramtopetrinetmt.ActivityDiagramToPetriNetAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramToPetriNet",
    	activityDiagramToPetriNet
    );
    MelangeRegistry.ModelTypeDescriptor activityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT", "", "http://org.gemoc.activitydiagram.sequential.ad2petri.activitydiagrammt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT",
    	activityDiagramMT
    );
    MelangeRegistry.ModelTypeDescriptor activityDiagramToPetriNetMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramToPetriNetMT", "", "http://org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinetmt/"
    );
    activityDiagramToPetriNetMT.addSuperType("org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramToPetriNetMT",
    	activityDiagramToPetriNetMT
    );
  }
}
