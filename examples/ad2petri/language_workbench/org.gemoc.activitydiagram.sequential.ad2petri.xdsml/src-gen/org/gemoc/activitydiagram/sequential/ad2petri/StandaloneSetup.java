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
    	org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivitydiagramPackage.eNS_URI,
    	org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivitydiagramPackage.eNS_URI,
    	org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor compiledActivityDiagram = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagram", "", "http://org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagram/activitydiagram/", "org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagramMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagram",
    	compiledActivityDiagram
    );
    MelangeRegistry.LanguageDescriptor interpretedActivityDiagram = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagram", "", "http://org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram/activitydiagram/", "org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagramMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagram",
    	interpretedActivityDiagram
    );
    MelangeRegistry.ModelTypeDescriptor activityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT", "", "http://org.gemoc.activitydiagram.sequential.ad2petri.activitydiagrammt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT",
    	activityDiagramMT
    );
    MelangeRegistry.ModelTypeDescriptor compiledActivityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagramMT", "", "http://org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt/"
    );
    compiledActivityDiagramMT.addSuperType("org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT");
    compiledActivityDiagramMT.addSuperType("org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagramMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagramMT",
    	compiledActivityDiagramMT
    );
    MelangeRegistry.ModelTypeDescriptor interpretedActivityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagramMT", "", "http://org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt/"
    );
    interpretedActivityDiagramMT.addSuperType("org.gemoc.activitydiagram.sequential.ad2petri.ActivityDiagramMT");
    interpretedActivityDiagramMT.addSuperType("org.gemoc.activitydiagram.sequential.ad2petri.CompiledActivityDiagramMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.activitydiagram.sequential.ad2petri.InterpretedActivityDiagramMT",
    	interpretedActivityDiagramMT
    );
  }
}
