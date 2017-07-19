# Ad2petri

This examples is a small activity diagrams DSL that compiles to Petri nets, with feedback management.

## Usage

1. Start the GEMOC Studio
2. Import all the plugins of the feedback engine from the folder [`../../plugins`](../../plugins)
3. Import the [Petri net target language](https://github.com/gemoc/petrinet/tree/master/petrinetv1)
4. Import the [existing source activity diagrams abstract and concrete syntaxes](https://github.com/gemoc/activitydiagram/tree/master/dev/gemoc_sequential/language_workbench), which are the plugins `org.gemoc.activitydiagram.sequential.model`, `org.gemoc.activitydiagram.sequential.model.dynamic`, `org.gemoc.activitydiagram.sequential.xactivitydiagram.design`
5. Import all the language workbench plugins of the ad2petri example from the folder [`language_workbench`](language_workbench)
6. From this workpace, start a new Eclipse Application
7. Import the modeling workbench plugin of the ad2petri example from the folder [modeling_workbench](modeling_workbench)
8. Create a new debug run configuration of type *GEMOC Compiled Executable Model*
9. Select the [`basic/test2.xmi`](modeling_workbench/org.gemoc.activitydiagram.sequential.ad2petri.models/basic/test2.xmi) model, and the Melange language `CompiledActivityDiagram`, and the animator [`basic/test2.aird`](modeling_workbench/org.gemoc.activitydiagram.sequential.ad2petri.models/basic/test2.aird)
10. Tick the box *Break at start*, to enter debug mode at start
11. Start the execution
