/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

import java.util.Scanner;

/**
 *
 * @author Labymed
 */
public class ProyectoAlgoritmos {// PRIMERA LLAVE

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // SEGUNDA LLAVE
 
        Scanner sn = new Scanner(System.in);
        
        // VEHICULOS
        float SedanEconomico= 18940.00F;
        float Sedan= 23570.00F;
        float Deportivo = 24100.00F;
        float Hibrido = 25100.00F;
        float Coupe = 19350.00F;
        float CoupeDeportivo = 24100.00F;
        float Compacto = 16190.00F;
        float Hatchback = 20150.00F;
        float EconomicoVersionRally = 34700F;
        
        //TIPOS DE TRANSMISION
        float Manual = 0.00F;
        float CVT = 800.00F;
        float ManualConTurbo = 0.00F;
        float CVTConTurbo= 800F;
        
        //COLOR DE PINTURA EXTERIOR
        float CosmicBlue= 0.00F;
        float BurgundyNight = 0.00F;
        float RallyeRed = 0.000F;
        float CrystalBlack = 0.00F;
        float ModernSteel= 0.00F;
        float TaffetaWhile = 0.00F;
        float EnergyGreen = 0.00F;
        float KonaCoffee = 0.00F;
        float OrangeFury = 0.00F;
        float HeliosYellow = 0.00F;
        float SonicGray = 0.00F;
        float PolishedMetal = 0.00F;
        
        //COLOR DE TAPICERIA
        float GrayCloth = 0.00F;
        float BlackCloth = 0.00F;
        float Black_GrayCloth = 0.00F;
        float Red_BlackSuedeEffectFabric = 0.00F;
        
        //TIPOS DE AROS
        float pulgadas_15  = 0.00F;
        float pulgadas_16 = 0.00F;
        float pulgadas_17 = 1688.00F;
        float pulgadas_18 = 1700.00F;
        float pulgadas_19 = 3011.00F;
        
        //ACCESORIOS EXTERIORES
        float BodySideMolding = 217.00F;
        float CarCover = 230.00F;
        float DecklidSpoiler = 299.99F;
        float DoorEdgeFilm = 42.00F;
        float DoorEdgeGuards = 84.00F;
        float DoorTrimChrome = 285.00F;
        float DoorVisor = 185.00F;
        float FrontFenderEmblems = 50.00F;
        float RearBumperApplique = 70.00F;
        float FogLights = 325.00F;
        float NoseMascs = 158.00F;
        float MoonrofVisor = 138.00F;
        float SplashGuardSet = 104.00F;
        float DustCover = 350.00F;
        float DoorMirrorCoverCarbonFiber = 520.00F;
        
        //ACCESORIOS INTERIORES
        float All_SeasonFloorMats = 142.00F;
        float Automatic_DimmingMirror = 219.00F;
        float CargoHook = 12.00F;
        float CargoNet = 49.00F;
        float ConsoleIllumination = 250.00F;
        float CargoOrganizer = 87.00F;
        float DoorPanelProtector = 149.00F;
        float ArmrestCompartiment = 337.00F;
        float DoorSillTrim_Illuminated = 290.00F;
        float CargoCover = 166.00F;
        float CargoLiner = 187.00F;
                                                                                                
        //ACCESORIOS ELECTRÓNICOS
        float WirelllesPhoneCharger = 305.00F;
        float USBCharger_2Amp = 120.00F;
        float PuddleLight = 185.00F;
        float ParkingSensors = 514.00F;
        
        //DECLARACIONES PARA EL PROGRAMA
        boolean salir = false;
        int opcion;
        float Ninguno = 0.00F;
        
        //SUMATORIAS
        float total=(float)(SedanEconomico+pulgadas_17);
        float total1=(float)(SedanEconomico+pulgadas_18);
        float total2=(float)(SedanEconomico+pulgadas_19);
        float total3=(float)(SedanEconomico+BodySideMolding);
        float total4=(float)(SedanEconomico+CarCover);
        float total5=(float)(SedanEconomico+DecklidSpoiler);
        float total6=(float)(SedanEconomico+DoorEdgeFilm);
        float total7=(float)(SedanEconomico+DoorEdgeGuards);      
        float total8=(float)(SedanEconomico+DoorTrimChrome);
        float total9=(float)(SedanEconomico+DoorVisor);
        float total10=(float)(SedanEconomico+FrontFenderEmblems);        
        float total11=(float)(SedanEconomico+RearBumperApplique);
        float total12=(float)(SedanEconomico+FogLights); 
        float total13=(float)(SedanEconomico+NoseMascs);
        float total14=(float)(SedanEconomico+MoonrofVisor);
        float total15=(float)(SedanEconomico+SplashGuardSet);
        float total16=(float)(SedanEconomico+DustCover);
        float total17=(float)(SedanEconomico+DoorMirrorCoverCarbonFiber);
        float total18=(float)(SedanEconomico+All_SeasonFloorMats);
        float total19=(float)(SedanEconomico+Automatic_DimmingMirror);
        float total20=(float)(SedanEconomico+CargoHook);
        float total21=(float)(SedanEconomico+CargoNet);
        float total22=(float)(SedanEconomico+ConsoleIllumination);
        float total23=(float)(SedanEconomico+CargoOrganizer);
        float total24=(float)(SedanEconomico+DoorPanelProtector);
        float total25=(float)(SedanEconomico+ArmrestCompartiment);
        float total26=(float)(SedanEconomico+DoorSillTrim_Illuminated);
        float total27=(float)(SedanEconomico+CargoCover);
        float total28=(float)(SedanEconomico+CargoLiner);
        float total29=(float)(SedanEconomico+WirelllesPhoneCharger);
        float total30=(float)(SedanEconomico+USBCharger_2Amp);
        float total31=(float)(SedanEconomico+PuddleLight);
        float total32=(float)(SedanEconomico+ParkingSensors);
        
        //SEDAN
        float total33=(float)(Sedan+CVT);
        float total34=(float)(Sedan+CVTConTurbo);
        float total35=(float)(Sedan+pulgadas_17);
        float total36=(float)(Sedan+pulgadas_18);
        float total37=(float)(Sedan+pulgadas_19);
        float total38=(float)(Sedan+BodySideMolding);
        float total39=(float)(Sedan+CarCover);
        float total40=(float)(Sedan+DecklidSpoiler);
        float total41=(float)(Sedan+DoorEdgeFilm);
        float total42=(float)(Sedan+DoorEdgeGuards);      
        float total43=(float)(Sedan+DoorTrimChrome);
        float total44=(float)(Sedan+DoorVisor);
        float total45=(float)(Sedan+FrontFenderEmblems);        
        float total46=(float)(Sedan+RearBumperApplique);
        float total47=(float)(Sedan+FogLights); 
        float total48=(float)(Sedan+NoseMascs);
        float total49=(float)(Sedan+MoonrofVisor);
        float total50=(float)(Sedan+SplashGuardSet);
        float total51=(float)(Sedan+DustCover);
        float total52=(float)(Sedan+DoorMirrorCoverCarbonFiber);
        float total53=(float)(Sedan+All_SeasonFloorMats);
        float total54=(float)(Sedan+Automatic_DimmingMirror);
        float total55=(float)(Sedan+CargoHook);
        float total56=(float)(Sedan+CargoNet);
        float total57=(float)(Sedan+ConsoleIllumination);
        float total58=(float)(Sedan+CargoOrganizer);
        float total59=(float)(Sedan+DoorPanelProtector);
        float total60=(float)(Sedan+ArmrestCompartiment);
        float total61=(float)(Sedan+DoorSillTrim_Illuminated);
        float total62=(float)(Sedan+CargoCover);
        float total63=(float)(Sedan+CargoLiner);
        float total64=(float)(Sedan+WirelllesPhoneCharger);
        float total65=(float)(Sedan+USBCharger_2Amp);
        float total66=(float)(Sedan+PuddleLight);
        float total67=(float)(Sedan+ParkingSensors);
        
        //DEPORTIVO
        float total68=(float)(Deportivo+CVT);
        float total69=(float)(Deportivo+CVTConTurbo);
        float total70=(float)(Deportivo+pulgadas_17);
        float total71=(float)(Deportivo+pulgadas_18);
        float total72=(float)(Deportivo+pulgadas_19);
        float total73=(float)(Deportivo+BodySideMolding);
        float total74=(float)(Deportivo+CarCover);
        float total75=(float)(Deportivo+DecklidSpoiler);
        float total76=(float)(Deportivo+DoorEdgeFilm);
        float total77=(float)(Deportivo+DoorEdgeGuards);      
        float total78=(float)(Deportivo+DoorTrimChrome);
        float total79=(float)(Deportivo+DoorVisor);
        float total80=(float)(Deportivo+FrontFenderEmblems);        
        float total81=(float)(Deportivo+RearBumperApplique);
        float total82=(float)(Deportivo+FogLights); 
        float total83=(float)(Deportivo+NoseMascs);
        float total84=(float)(Deportivo+MoonrofVisor);
        float total85=(float)(Deportivo+SplashGuardSet);
        float total86=(float)(Deportivo+DustCover);
        float total87=(float)(Deportivo+DoorMirrorCoverCarbonFiber);
        float total88=(float)(Deportivo+All_SeasonFloorMats);
        float total89=(float)(Deportivo+Automatic_DimmingMirror);
        float total90=(float)(Deportivo+CargoHook);
        float total91=(float)(Deportivo+CargoNet);
        float total92=(float)(Deportivo+ConsoleIllumination);
        float total93=(float)(Deportivo+CargoOrganizer);
        float total94=(float)(Deportivo+DoorPanelProtector);
        float total95=(float)(Deportivo+ArmrestCompartiment);
        float total96=(float)(Deportivo+DoorSillTrim_Illuminated);
        float total97=(float)(Deportivo+CargoCover);
        float total98=(float)(Deportivo+CargoLiner);
        float total99=(float)(Deportivo+WirelllesPhoneCharger);
        float total100=(float)(Deportivo+USBCharger_2Amp);
        float total101=(float)(Deportivo+PuddleLight);
        float total102=(float)(Deportivo+ParkingSensors);
        
        //Hibrido
        float total103=(float)(Hibrido+CVT);
        float total104=(float)(Hibrido+CVTConTurbo);
        float total105=(float)(Hibrido+pulgadas_17);
        float total106=(float)(Hibrido+pulgadas_18);
        float total107=(float)(Hibrido+pulgadas_19);
        float total108=(float)(Hibrido+BodySideMolding);
        float total109=(float)(Hibrido+CarCover);
        float total110=(float)(Hibrido+DecklidSpoiler);
        float total111=(float)(Hibrido+DoorEdgeFilm);
        float total112=(float)(Hibrido+DoorEdgeGuards);      
        float total113=(float)(Hibrido+DoorTrimChrome);
        float total114=(float)(Hibrido+DoorVisor);
        float total115=(float)(Hibrido+FrontFenderEmblems);        
        float total116=(float)(Hibrido+RearBumperApplique);
        float total117=(float)(Hibrido+FogLights); 
        float total118=(float)(Hibrido+NoseMascs);
        float total119=(float)(Hibrido+MoonrofVisor);
        float total120=(float)(Hibrido+SplashGuardSet);
        float total121=(float)(Hibrido+DustCover);
        float total122=(float)(Hibrido+DoorMirrorCoverCarbonFiber);
        float total123=(float)(Hibrido+All_SeasonFloorMats);
        float total124=(float)(Hibrido+Automatic_DimmingMirror);
        float total125=(float)(Hibrido+CargoHook);
        float total126=(float)(Hibrido+CargoNet);
        float total127=(float)(Hibrido+ConsoleIllumination);
        float total128=(float)(Hibrido+CargoOrganizer);
        float total129=(float)(Hibrido+DoorPanelProtector);
        float total130=(float)(Hibrido+ArmrestCompartiment);
        float total131=(float)(Hibrido+DoorSillTrim_Illuminated);
        float total132=(float)(Hibrido+CargoCover);
        float total133=(float)(Hibrido+CargoLiner);
        float total134=(float)(Hibrido+WirelllesPhoneCharger);
        float total135=(float)(Hibrido+USBCharger_2Amp);
        float total136=(float)(Hibrido+PuddleLight);
        float total137=(float)(Hibrido+ParkingSensors);
        
         //COUPE
        float total138=(float)(Coupe+CVT);
        float total139=(float)(Coupe+CVTConTurbo);
        float total140=(float)(Coupe+pulgadas_17);
        float total141=(float)(Coupe+pulgadas_18);
        float total142=(float)(Coupe+pulgadas_19);
        float total143=(float)(Coupe+BodySideMolding);
        float total144=(float)(Coupe+CarCover);
        float total145=(float)(Coupe+DecklidSpoiler);
        float total146=(float)(Coupe+DoorEdgeFilm);
        float total147=(float)(Coupe+DoorEdgeGuards);      
        float total148=(float)(Coupe+DoorTrimChrome);
        float total149=(float)(Coupe+DoorVisor);
        float total150=(float)(Coupe+FrontFenderEmblems);        
        float total151=(float)(Coupe+RearBumperApplique);
        float total152=(float)(Coupe+FogLights); 
        float total153=(float)(Coupe+NoseMascs);
        float total154=(float)(Coupe+MoonrofVisor);
        float total155=(float)(Coupe+SplashGuardSet);
        float total156=(float)(Coupe+DustCover);
        float total157=(float)(Coupe+DoorMirrorCoverCarbonFiber);
        float total158=(float)(Coupe+All_SeasonFloorMats);
        float total159=(float)(Coupe+Automatic_DimmingMirror);
        float total160=(float)(Coupe+CargoHook);
        float total161=(float)(Coupe+CargoNet);
        float total162=(float)(Coupe+ConsoleIllumination);
        float total163=(float)(Coupe+CargoOrganizer);
        float total164=(float)(Coupe+DoorPanelProtector);
        float total165=(float)(Coupe+ArmrestCompartiment);
        float total166=(float)(Coupe+DoorSillTrim_Illuminated);
        float total167=(float)(Coupe+CargoCover);
        float total168=(float)(Coupe+CargoLiner);
        float total169=(float)(Coupe+WirelllesPhoneCharger);
        float total170=(float)(Coupe+USBCharger_2Amp);
        float total171=(float)(Coupe+PuddleLight);
        float total172=(float)(Coupe+ParkingSensors);
        
        //COUPE DEPORTIVO
        float total173=(float)(CoupeDeportivo+CVT);
        float total174=(float)(CoupeDeportivo+CVTConTurbo);
        float total175=(float)(CoupeDeportivo+pulgadas_17);
        float total176=(float)(CoupeDeportivo+pulgadas_18);
        float total177=(float)(CoupeDeportivo+pulgadas_19);
        float total178=(float)(CoupeDeportivo+BodySideMolding);
        float total179=(float)(CoupeDeportivo+CarCover);
        float total180=(float)(CoupeDeportivo+DecklidSpoiler);
        float total181=(float)(CoupeDeportivo+DoorEdgeFilm);
        float total182=(float)(CoupeDeportivo+DoorEdgeGuards);      
        float total183=(float)(CoupeDeportivo+DoorTrimChrome);
        float total184=(float)(CoupeDeportivo+DoorVisor);
        float total185=(float)(CoupeDeportivo+FrontFenderEmblems);        
        float total186=(float)(CoupeDeportivo+RearBumperApplique);
        float total187=(float)(CoupeDeportivo+FogLights); 
        float total188=(float)(CoupeDeportivo+NoseMascs);
        float total189=(float)(CoupeDeportivo+MoonrofVisor);
        float total190=(float)(CoupeDeportivo+SplashGuardSet);
        float total191=(float)(CoupeDeportivo+DustCover);
        float total192=(float)(CoupeDeportivo+DoorMirrorCoverCarbonFiber);
        float total193=(float)(CoupeDeportivo+All_SeasonFloorMats);
        float total194=(float)(CoupeDeportivo+Automatic_DimmingMirror);
        float total195=(float)(CoupeDeportivo+CargoHook);
        float total196=(float)(CoupeDeportivo+CargoNet);
        float total197=(float)(CoupeDeportivo+ConsoleIllumination);
        float total198=(float)(CoupeDeportivo+CargoOrganizer);
        float total199=(float)(CoupeDeportivo+DoorPanelProtector);
        float total200=(float)(CoupeDeportivo+ArmrestCompartiment);
        float total201=(float)(CoupeDeportivo+DoorSillTrim_Illuminated);
        float total202=(float)(CoupeDeportivo+CargoCover);
        float total203=(float)(CoupeDeportivo+CargoLiner);
        float total204=(float)(CoupeDeportivo+WirelllesPhoneCharger);
        float total205=(float)(CoupeDeportivo+USBCharger_2Amp);
        float total206=(float)(CoupeDeportivo+PuddleLight);
        float total207=(float)(CoupeDeportivo+ParkingSensors);
        
        //COMPACTO
        float total208=(float)(Compacto+CVT);
        float total209=(float)(Compacto+CVTConTurbo);
        float total210=(float)(Compacto+pulgadas_17);
        float total211=(float)(Compacto+pulgadas_18);
        float total212=(float)(Compacto+pulgadas_19);
        float total213=(float)(Compacto+BodySideMolding);
        float total214=(float)(Compacto+CarCover);
        float total215=(float)(Compacto+DecklidSpoiler);
        float total216=(float)(Compacto+DoorEdgeFilm);
        float total217=(float)(Compacto+DoorEdgeGuards);      
        float total218=(float)(Compacto+DoorTrimChrome);
        float total219=(float)(Compacto+DoorVisor);
        float total220=(float)(Compacto+FrontFenderEmblems);        
        float total221=(float)(Compacto+RearBumperApplique);
        float total222=(float)(Compacto+FogLights); 
        float total223=(float)(Compacto+NoseMascs);
        float total224=(float)(Compacto+MoonrofVisor);
        float total225=(float)(Compacto+SplashGuardSet);
        float total226=(float)(Compacto+DustCover);
        float total227=(float)(Compacto+DoorMirrorCoverCarbonFiber);
        float total228=(float)(Compacto+All_SeasonFloorMats);
        float total229=(float)(Compacto+Automatic_DimmingMirror);
        float total230=(float)(Compacto+CargoHook);
        float total231=(float)(Compacto+CargoNet);
        float total232=(float)(Compacto+ConsoleIllumination);
        float total233=(float)(Compacto+CargoOrganizer);
        float total234=(float)(Compacto+DoorPanelProtector);
        float total235=(float)(Compacto+ArmrestCompartiment);
        float total236=(float)(Compacto+DoorSillTrim_Illuminated);
        float total237=(float)(Compacto+CargoCover);
        float total238=(float)(Compacto+CargoLiner);
        float total239=(float)(Compacto+WirelllesPhoneCharger);
        float total240=(float)(Compacto+USBCharger_2Amp);
        float total241=(float)(Compacto+PuddleLight);
        float total242=(float)(Compacto+ParkingSensors);
        
        //CHATCHBACK
        float total243=(float)(Hatchback+CVT);
        float total244=(float)(Hatchback+CVTConTurbo);
        float total245=(float)(Hatchback+pulgadas_17);
        float total246=(float)(Hatchback+pulgadas_18);
        float total247=(float)(Hatchback+pulgadas_19);
        float total248=(float)(Hatchback+BodySideMolding);
        float total249=(float)(Hatchback+CarCover);
        float total250=(float)(Hatchback+DecklidSpoiler);
        float total251=(float)(Hatchback+DoorEdgeFilm);
        float total252=(float)(Hatchback+DoorEdgeGuards);      
        float total253=(float)(Hatchback+DoorTrimChrome);
        float total254=(float)(Hatchback+DoorVisor);
        float total255=(float)(Hatchback+FrontFenderEmblems);        
        float total256=(float)(Hatchback+RearBumperApplique);
        float total257=(float)(Hatchback+FogLights); 
        float total258=(float)(Hatchback+NoseMascs);
        float total259=(float)(Hatchback+MoonrofVisor);
        float total260=(float)(Hatchback+SplashGuardSet);
        float total261=(float)(Hatchback+DustCover);
        float total262=(float)(Hatchback+DoorMirrorCoverCarbonFiber);
        float total263=(float)(Hatchback+All_SeasonFloorMats);
        float total264=(float)(Hatchback+Automatic_DimmingMirror);
        float total265=(float)(Hatchback+CargoHook);
        float total266=(float)(Hatchback+CargoNet);
        float total267=(float)(Hatchback+ConsoleIllumination);
        float total268=(float)(Hatchback+CargoOrganizer);
        float total269=(float)(Hatchback+DoorPanelProtector);
        float total270=(float)(Hatchback+ArmrestCompartiment);
        float total271=(float)(Hatchback+DoorSillTrim_Illuminated);
        float total272=(float)(Hatchback+CargoCover);
        float total273=(float)(Hatchback+CargoLiner);
        float total274=(float)(Hatchback+WirelllesPhoneCharger);
        float total275=(float)(Hatchback+USBCharger_2Amp);
        float total276=(float)(Hatchback+PuddleLight);
        float total277=(float)(Hatchback+ParkingSensors);
        
        //CHATCHBACK
        float total278=(float)(EconomicoVersionRally+CVT);
        float total279=(float)(EconomicoVersionRally+CVTConTurbo);
        float total280=(float)(EconomicoVersionRally+pulgadas_17);
        float total281=(float)(EconomicoVersionRally+pulgadas_18);
        float total282=(float)(EconomicoVersionRally+pulgadas_19);
        float total283=(float)(EconomicoVersionRally+BodySideMolding);
        float total284=(float)(EconomicoVersionRally+CarCover);
        float total285=(float)(EconomicoVersionRally+DecklidSpoiler);
        float total286=(float)(EconomicoVersionRally+DoorEdgeFilm);
        float total287=(float)(EconomicoVersionRally+DoorEdgeGuards);      
        float total288=(float)(EconomicoVersionRally+DoorTrimChrome);
        float total289=(float)(EconomicoVersionRally+DoorVisor);
        float total290=(float)(EconomicoVersionRally+FrontFenderEmblems);        
        float total291=(float)(EconomicoVersionRally+RearBumperApplique);
        float total292=(float)(EconomicoVersionRally+FogLights); 
        float total293=(float)(EconomicoVersionRally+NoseMascs);
        float total294=(float)(EconomicoVersionRally+MoonrofVisor);
        float total295=(float)(EconomicoVersionRally+SplashGuardSet);
        float total296=(float)(EconomicoVersionRally+DustCover);
        float total297=(float)(EconomicoVersionRally+DoorMirrorCoverCarbonFiber);
        float total298=(float)(EconomicoVersionRally+All_SeasonFloorMats);
        float total299=(float)(EconomicoVersionRally+Automatic_DimmingMirror);
        float total300=(float)(EconomicoVersionRally+CargoHook);
        float total301=(float)(EconomicoVersionRally+CargoNet);
        float total302=(float)(EconomicoVersionRally+ConsoleIllumination);
        float total303=(float)(EconomicoVersionRally+CargoOrganizer);
        float total304=(float)(EconomicoVersionRally+DoorPanelProtector);
        float total305=(float)(EconomicoVersionRally+ArmrestCompartiment);
        float total306=(float)(EconomicoVersionRally+DoorSillTrim_Illuminated);
        float total307=(float)(EconomicoVersionRally+CargoCover);
        float total308=(float)(EconomicoVersionRally+CargoLiner);
        float total309=(float)(EconomicoVersionRally+WirelllesPhoneCharger);
        float total310=(float)(EconomicoVersionRally+USBCharger_2Amp);
        float total311=(float)(EconomicoVersionRally+PuddleLight);
        float total312=(float)(EconomicoVersionRally+ParkingSensors);
        
        // EMPIEZA EL CICLO DEL PROGRAMA PARA EL CONSENCIONARIO DE AUTOS
        while (!salir) {  //TERCELLA LLAVE DEL WHILE     
            System.out.println("-------------------------------------");
            System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
            System.out.println("1. Seleccionar Automovil");
            System.out.println("2. Salir"); 
            System.out.println("Introduzca su Opcion Por Favor");
            opcion = sn.nextInt();
            
            switch (opcion){ // CUARTA LLAVE DEL PRIMER SWITCH
                case 1: // YA SE SEÑALO EL PRIMER BREAK
                    //LISTADO DE SELECCION DE VEHICULOS
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("01.- Sedán Económico");
                    System.out.println("02.- Sedán ");
                    System.out.println("03.- Deportivo");
                    System.out.println("04.- Híbrido");
                    System.out.println("05.- Coupe");
                    System.out.println("06.- Coupe Deportivo ");
                    System.out.println("07.- Compacto ");
                    System.out.println("08.- Hatchback ");
                    System.out.println("09.- Económico versión Rally ");
                    System.out.println("10.- Regresar a menú principal");
                    System.out.println(" Por Favor Ingrese la gama del Vehículo");
                    opcion = sn.nextInt();   
                             
                    switch (opcion){ // DEL PRIMER VEHICULO SEDAN ECONOMICO SEGUNDO SWITCH
                        case 1: // MENU DEL PRIMER VEHICULO
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("¿Desea agregar amenidades?");
                    System.out.println("1.  SI DESEO AGREGAR AMENIDADES ");
                    System.out.println("2.  NO AGREGAR NINGUNA AMENIDAD ");
                    System.out.println(" Introduzca su Opcion Por Favor\n  1. SI\n  2. NO ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){ // TERCER SWITCH DEL PRIMERO
                        case 1: // PRIMER CASO DEL TERCER SWITCH AMENIDADES
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println(" Tipos de Amenidades :");
                    System.out.println("01.- Tipo de transmisión");
                    System.out.println("02.- Color de pintura exterior");
                    System.out.println("03.- Color de Tapiceria");
                    System.out.println("04.- Aros");
                    System.out.println("05.- Accesorios exteriores");
                    System.out.println("06.- Accesorios interiores");
                    System.out.println("07.- Accesorios electrónicos");
                    System.out.println("Ingrese el tipo de amenidad Por Favor: ");
                    opcion = sn.nextInt();
                    
                    //SE EMPEZARA CON LAS AMENIDADES
                    switch (opcion){ //INICIA PRIMERA AMENIDAD
                        case 1:  //
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Tipos de Transmisión: ");
                    System.out.println("01.- Manual            Q.  "+Manual);
                    System.out.println("02.- CVT               Q."+CVT);
                    System.out.println("03.- Manual con Turbo  Q.  "+ManualConTurbo);
                    System.out.println("04.- CVT con Turbo     Q."+CVTConTurbo);
                    System.out.println(" Ingrese el tipo de transmisión: ");
                    opcion =sn.nextInt(); 
                    
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Manual           Q.     "+Manual);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("CVT              Q.   "+CVT);
                    System.out.println("Total a pagar :  Q. 19740.00");
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico    Q. "+SedanEconomico);
                    System.out.println("Manual con Turbo   Q.     "+ManualConTurbo);
                    System.out.println("Total a pagar :    Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("CVT con Turbo    Q.   "+CVTConTurbo);
                    System.out.println("Total a pagar :  Q. 19740.00 ");
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                            break; // PRIMERA AMENIDAD 
                             case 2: //SEGUNDA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Color de pintura Exterior");
                    System.out.println("01.- Cosmic Blue         Q. "+CosmicBlue); 
                    System.out.println("02.- Burgundy Night      Q. "+BurgundyNight);        
                    System.out.println("03.- Rallye Red          Q. "+RallyeRed);
                    System.out.println("04.- Crystal Black       Q. "+CrystalBlack);
                    System.out.println("05.- Modern Steel        Q. "+ModernSteel);
                    System.out.println("06.- TaffetaWhile        Q. "+TaffetaWhile);
                    System.out.println("07.- Energy Green        Q. "+EnergyGreen);
                    System.out.println("08.- Kona Coffee         Q. "+KonaCoffee);
                    System.out.println("09.- Orange Fury         Q. "+OrangeFury);
                    System.out.println("10.- Helios Yellow       Q. "+HeliosYellow);
                    System.out.println("11.- Sonic Gray          Q. "+SonicGray);
                    System.out.println("12.- Polished Metal      Q. "+PolishedMetal);
                    System.out.println(" Ingrese el tipo de color de pintura exterior: ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Economico  Q. "+SedanEconomico);
                    System.out.println("Cosmic Blue      Q.     "+CosmicBlue);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Burgundy Night   Q.     "+BurgundyNight);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico    Q. "+SedanEconomico);
                    System.out.println("Rallye Red         Q.     "+RallyeRed);
                    System.out.println("Total a pagar :    Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Crystal Black    Q.     "+CrystalBlack);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Modern Steel     Q.     "+ModernSteel);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Taffeta While    Q.     "+TaffetaWhile);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Energy Green     Q.     "+EnergyGreen);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Kona Coffee      Q.     "+KonaCoffee);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Orange Fury      Q.     "+OrangeFury);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Helios Yellow    Q.     "+HeliosYellow);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                              break;
                    
                    case 11:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Sonic Gray       Q.     "+SonicGray);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Polished Metal   Q.     "+PolishedMetal);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }    
                    break; //SEGUNDA AMENIDAD
                             case 3: //TERCERA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Color de tapiceria");
                    System.out.println("01.- Gray Cloth                     Q  "+GrayCloth);
                    System.out.println("02.- Black Cloth                    Q. "+BlackCloth);
                    System.out.println("03.- Black/Gray Cloth               Q. "+Black_GrayCloth);
                    System.out.println("04.- Red/Black Suede Effect-Fabric  Q. "+Red_BlackSuedeEffectFabric);
                    System.out.println("Seleccione el color del Vehiculo: ");
                    opcion = sn.nextInt();
                    
                    switch(opcion){
                         case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedan Economico  Q. "+SedanEconomico);
                    System.out.println("Gray Cloth       Q.     "+GrayCloth);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("Black Cloth      Q.     "+BlackCloth);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico    Q. "+SedanEconomico);
                    System.out.println("Black/Gray Cloth   Q.     "+Black_GrayCloth);
                    System.out.println("Total a pagar :    Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico                Q. "+SedanEconomico);
                    System.out.println("Red/Black Suede Effect-Fabric  Q.     "+Red_BlackSuedeEffectFabric);
                    System.out.println("Total a pagar :                Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                                 break;         //TERCERA AMENIDAD 
                             case 4: //CUARTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Tipos de Aros");
                    System.out.println("1.- Aro de 15 pulgadas  Q.    "+pulgadas_15);
                    System.out.println("2.- Aro de 16 pulgadas  Q.    "+pulgadas_16);
                    System.out.println("3.- Aro de 17 pulgadas  Q. "+pulgadas_17);
                    System.out.println("4.- Aro de 18 pulgadas  Q. "+pulgadas_18);
                    System.out.println("5.- Aro de 19 pulgadas  Q. "+pulgadas_19);
                    System.out.println("Selecciones el tamaño del Aro: ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedan Economico  Q. "+SedanEconomico);
                    System.out.println("15 pulgadas      Q.     "+pulgadas_15);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico  Q. "+SedanEconomico);
                    System.out.println("16 pulgadas      Q.     "+pulgadas_16);
                    System.out.println("Total a pagar :  Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico    Q. "+SedanEconomico);
                    System.out.println("17 pulgadas        Q.  "+pulgadas_17);
                    System.out.println("Total a pagar :    Q. "+total);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("18 pulgadas          Q.  "+pulgadas_18);
                    System.out.println("Total a pagar :      Q. "+total1);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("19 pulgadas          Q.  "+pulgadas_19);
                    System.out.println("Total a pagar :      Q. "+total2);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                                 break; // CUARTA AMENIDAD
                                 
                             case 5: //QUINTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Accesorios Exteriores");
                    System.out.println("1.- Body Side Molding                 Q."+BodySideMolding);
                    System.out.println("2.- Car Cover                         Q."+CarCover);
                    System.out.println("3.- Decklid Spoiler                   Q."+DecklidSpoiler);
                    System.out.println("4.- Door Edge Film                    Q. "+DoorEdgeFilm);
                    System.out.println("5.- Door Edge Guards                  Q. "+DoorEdgeGuards);
                    System.out.println("6.- Door Trim Chrome                  Q."+DoorTrimChrome);
                    System.out.println("7.- Door Visor                        Q."+DoorVisor);
                    System.out.println("8.- Front Fender Emblems              Q. "+FrontFenderEmblems);
                    System.out.println("9.- Rear Bumper Applique              Q. "+RearBumperApplique);
                    System.out.println("10.- Fog Lights                       Q."+FogLights);
                    System.out.println("11.- Nose Mascs                       Q."+NoseMascs);
                    System.out.println("12.- Moonrof Visor                    Q."+MoonrofVisor);
                    System.out.println("13.- Splash Guard Set                 Q."+SplashGuardSet);
                    System.out.println("14.- Dust Cover                       Q."+DustCover);
                    System.out.println("15.- Door Mirror Cover - Carbon Fiber Q."+DoorMirrorCoverCarbonFiber);
                    System.out.println("Seleccione el Accesorio exterior que desee: ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("Body Side Molding    Q.   "+BodySideMolding);
                    System.out.println("Total a pagar :      Q. "+total3);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("Car Cover            Q.   "+CarCover);
                    System.out.println("Total a pagar :      Q. "+total4);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("Decklid Spoiler      Q.   "+DecklidSpoiler);
                    System.out.println("Total a pagar :      Q. "+total5);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("Door Edge Film       Q.    "+DoorEdgeFilm);
                    System.out.println("Total a pagar :      Q. "+total6);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("Door Edge Guards     Q.    "+DoorEdgeGuards);
                    System.out.println("Total a pagar :      Q. "+total7);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("Door Trim Chrome     Q.   "+DoorTrimChrome);
                    System.out.println("Total a pagar :      Q. "+total8);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("Door Visor           Q.   "+DoorVisor);
                    System.out.println("Total a pagar :      Q. "+total9);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico        Q. "+SedanEconomico);
                    System.out.println("Front Fender Emblems   Q.    "+FrontFenderEmblems);
                    System.out.println("Total a pagar :        Q. "+total10);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico        Q. "+SedanEconomico);
                    System.out.println("Rear Bumper Applique   Q.    "+RearBumperApplique);
                    System.out.println("Total a pagar :        Q. "+total11);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico    Q. "+SedanEconomico);
                    System.out.println("Fog Lights         Q.   "+FogLights);
                    System.out.println("Total a pagar :    Q. "+total12);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico    Q. "+SedanEconomico);
                    System.out.println("Nose Mascs         Q.   "+NoseMascs);
                    System.out.println("Total a pagar :    Q. "+total13);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico    Q. "+SedanEconomico);
                    System.out.println("Moonrof Visor      Q.   "+MoonrofVisor);
                    System.out.println("Total a pagar :    Q. "+total14);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                        break;
                           
                        case 13:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("Splash Guard Set     Q.   "+SplashGuardSet);
                    System.out.println("Total a pagar :      Q. "+total15);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 14:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico    Q. "+SedanEconomico);
                    System.out.println("Dust Cover         Q.   "+DustCover);
                    System.out.println("Total a pagar :    Q. "+total16);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                            
                        case 15:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico                  Q. "+SedanEconomico);
                    System.out.println("Door Mirror Cover-Carbon Fiber   Q.   "+DoorMirrorCoverCarbonFiber);
                    System.out.println("Total a pagar :                  Q. "+total17);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;           
                    }
                                 break;// QUINTA AMENIDAD
                             case 6: //SEXTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Accesorios Interiores");
                    System.out.println("1.- BAll-Seasons Floor Mats        Q."+All_SeasonFloorMats);
                    System.out.println("2.- Automatic-Dimming Mirror       Q."+Automatic_DimmingMirror);
                    System.out.println("3.- Cargo Hook                     Q. "+CargoHook);
                    System.out.println("4.- Cargo Net                      Q. "+CargoNet);
                    System.out.println("5.- Console Illumination           Q."+ConsoleIllumination);
                    System.out.println("6.- Cargo Organizer                Q. "+CargoOrganizer);
                    System.out.println("7.- Door Panel Protector           Q."+DoorPanelProtector);
                    System.out.println("8.- Armrest Compartiment           Q."+ArmrestCompartiment);
                    System.out.println("9.- Door Sill Trim-Illuminated     Q."+DoorSillTrim_Illuminated);
                    System.out.println("10.- Cargo Cover                   Q."+CargoCover);
                    System.out.println("11.- Cargo Liner                   Q."+CargoLiner);
                    System.out.println("Seleccione el Accesorio Interior que desee: ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico          Q. "+SedanEconomico);
                    System.out.println("All-Seasons Floor Mats   Q.   "+All_SeasonFloorMats);
                    System.out.println("Total a pagar :          Q. "+total18);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico            Q. "+SedanEconomico);
                    System.out.println("Automatic-Dimming Mirror   Q.   "+Automatic_DimmingMirror);
                    System.out.println("Total a pagar :            Q. "+total19);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico     Q. "+SedanEconomico);
                    System.out.println("Cargo Hook          Q.    "+CargoHook);
                    System.out.println("Total a pagar :     Q. "+total20);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico     Q. "+SedanEconomico);
                    System.out.println("Cargo Net           Q.    "+CargoNet);
                    System.out.println("Total a pagar :     Q. "+total21);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico         Q. "+SedanEconomico);
                    System.out.println("Console Illumination    Q.   "+ConsoleIllumination);
                    System.out.println("Total a pagar :         Q. "+total22);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico      Q. "+SedanEconomico);
                    System.out.println("Cargo Organizer      Q.   "+CargoOrganizer);
                    System.out.println("Total a pagar :      Q. "+total23);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico         Q. "+SedanEconomico);
                    System.out.println("Door Panel Protector    Q.   "+DoorPanelProtector);
                    System.out.println("Total a pagar :         Q. "+total24);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico        Q. "+SedanEconomico);
                    System.out.println("Armrest Compartiment   Q.   "+ArmrestCompartiment);
                    System.out.println("Total a pagar :        Q. "+total25);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico               Q. "+SedanEconomico);
                    System.out.println("Door Sill Trim-Illuminated    Q.   "+DoorSillTrim_Illuminated);
                    System.out.println("Total a pagar :               Q. "+total26);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico    Q. "+SedanEconomico);
                    System.out.println("Cargo Cover        Q.   "+CargoCover);
                    System.out.println("Total a pagar :    Q. "+total27);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico    Q. "+SedanEconomico);
                    System.out.println("Cargo Liner        Q.   "+CargoLiner);
                    System.out.println("Total a pagar :    Q. "+total28);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                    }
                                 break; // SEXTA AMENIDAD
                             case 7: // SEPTIMA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Accesorios Eletrónicos");
                    System.out.println("1.-Wireless Phone Charger Q."+WirelllesPhoneCharger);
                    System.out.println("2.-USB Charger - 2.1 Amp. Q."+USBCharger_2Amp);
                    System.out.println("3.-Puddle Light           Q."+PuddleLight);
                    System.out.println("4.-Parking Sensors        Q."+ParkingSensors);
                    System.out.println("Seleccione el Accesorio Electrónico: ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){
                      case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico          Q. "+SedanEconomico);
                    System.out.println("Wireless Phone Charger   Q.   "+WirelllesPhoneCharger);
                    System.out.println("Total a pagar :          Q. "+total29);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico           Q. "+SedanEconomico);
                    System.out.println("USB Charger - 2.1 Amp.    Q.   "+USBCharger_2Amp);
                    System.out.println("Total a pagar :           Q. "+total30);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico     Q. "+SedanEconomico);
                    System.out.println("Puddle Light       Q.    "+PuddleLight);
                    System.out.println("Total a pagar :     Q. "+total31);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ECONÓMICO");
                    System.out.println("Sedán Económico     Q. "+SedanEconomico);
                    System.out.println("Parking Sensors     Q.   "+ParkingSensors);
                    System.out.println("Total a pagar :     Q. "+total32);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;  
                    }
                                 break; // SEPTIMA AMENIDAD
                    }//FINALIZA PIRMERA AMENIDAD
                            break; //PRIMER CASO DEL TERCER SWITCH AMENIDADES
                            
                        case 2: // SEGUNDO CASO DEL TERCER SWITCH AQUI SE SELECCIONA A NO AMENIDADES
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println(" USTED SELECCIONO NO AGREGAR NINGUNA AMENIDAD");
                    System.out.println("Gama seleccionada: SEDÁN ECONÓMICO Q. "+SedanEconomico);
                    System.out.println("Amenidades: Ninguna                Q.     "+Ninguno);
                    System.out.println("Total a Pagar:                     Q. "+SedanEconomico);
                    System.out.println("Digite el Numero 2 para Regresar"); 
                    opcion = sn.nextInt();
                            break; // SEGUNDO CASO DEL TERCER SWITCH AQUI SE SELECCIONA A NO AMENIDADES
                    } // TERCER SWITCH DEL PRIMERO
                            break; // MENU DEL PRIMER VEHICULO SEDAN ECONOMICO SEGUNDO SWITCH
                            
                            case 2: // MENU DEL SEGUNDO VEHICULO
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("¿Desea agregar amenidades?");
                    System.out.println("1.  SI DESEO AGREGAR AMENIDADES ");
                    System.out.println("2.  NO AGREGAR NINGUNA AMENIDAD ");
                    System.out.println(" Introduzca su Opcion Por Favor\n  1. SI\n  2. NO ");
                    opcion = sn.nextInt();  
                    
                    switch (opcion){ //PRIMER SWITCH DEL VEHICULO SEDAN
                        case 1:
                            //INICIA LA PRUEBA
                            switch (opcion){ // TERCER SWITCH DEL PRIMERO
                        case 1: // PRIMER CASO DEL TERCER SWITCH AMENIDADES
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN");
                    System.out.println(" Tipos de Amenidades :");
                    System.out.println("01.- Tipo de transmisión");
                    System.out.println("02.- Color de pintura exterior");
                    System.out.println("03.- Color de Tapiceria");
                    System.out.println("04.- Aros");
                    System.out.println("05.- Accesorios exteriores");
                    System.out.println("06.- Accesorios interiores");
                    System.out.println("07.- Accesorios electrónicos");
                    System.out.println("Ingrese el tipo de amenidad Por Favor: ");
                    opcion = sn.nextInt();
                    
                    //SE EMPEZARA CON LAS AMENIDADES
                    switch (opcion){ //INICIA PRIMERA AMENIDAD
                        case 1:  //
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Tipos de Transmisión: ");
                    System.out.println("01.- Manual            Q.  "+Manual);
                    System.out.println("02.- CVT               Q."+CVT);
                    System.out.println("03.- Manual con Turbo  Q.  "+ManualConTurbo);
                    System.out.println("04.- CVT con Turbo     Q."+CVTConTurbo);
                    System.out.println(" Ingrese el tipo de transmisión: ");
                    opcion =sn.nextInt(); 
                    
                    switch (opcion){
                    case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán Económico  Q. "+Sedan);
                    System.out.println("Manual           Q.     "+Manual);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán Económico  Q. "+Sedan);
                    System.out.println("CVT              Q.   "+CVT);
                    System.out.println("Total a pagar :  Q. "+total33);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN");
                    System.out.println("Sedán Económico    Q. "+Sedan);
                    System.out.println("Manual con Turbo   Q.     "+ManualConTurbo);
                    System.out.println("Total a pagar :    Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán Económico  Q. "+Sedan);
                    System.out.println("CVT con Turbo    Q.   "+CVTConTurbo);
                    System.out.println("Total a pagar :  Q. "+total34);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                            break; // PRIMERA AMENIDAD
                            
                             case 2: //SEGUNDA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Color de pintura Exterior");
                    System.out.println("01.- Cosmic Blue         Q. "+CosmicBlue); 
                    System.out.println("02.- Burgundy Night      Q. "+BurgundyNight);        
                    System.out.println("03.- Rallye Red          Q. "+RallyeRed);
                    System.out.println("04.- Crystal Black       Q. "+CrystalBlack);
                    System.out.println("05.- Modern Steel        Q. "+ModernSteel);
                    System.out.println("06.- TaffetaWhile        Q. "+TaffetaWhile);
                    System.out.println("07.- Energy Green        Q. "+EnergyGreen);
                    System.out.println("08.- Kona Coffee         Q. "+KonaCoffee);
                    System.out.println("09.- Orange Fury         Q. "+OrangeFury);
                    System.out.println("10.- Helios Yellow       Q. "+HeliosYellow);
                    System.out.println("11.- Sonic Gray          Q. "+SonicGray);
                    System.out.println("12.- Polished Metal      Q. "+PolishedMetal);
                    System.out.println(" Ingrese el tipo de color de pintura exterior: ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Cosmic Blue      Q.     "+CosmicBlue);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Burgundy Night   Q.     "+BurgundyNight);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán              Q. "+Sedan);
                    System.out.println("Rallye Red         Q.     "+RallyeRed);
                    System.out.println("Total a pagar :    Q. "+SedanEconomico);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Crystal Black    Q.     "+CrystalBlack);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Modern Steel     Q.     "+ModernSteel);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Taffeta While    Q.     "+TaffetaWhile);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Energy Green     Q.     "+EnergyGreen);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Kona Coffee      Q.     "+KonaCoffee);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Orange Fury      Q.     "+OrangeFury);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Helios Yellow    Q.     "+HeliosYellow);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                              break;
                    
                    case 11:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Sonic Gray       Q.     "+SonicGray);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Polished Metal   Q.     "+PolishedMetal);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                    break; //SEGUNDA AMENIDAD
                    
                             case 3: //TERCERA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Color de tapiceria");
                    System.out.println("01.- Gray Cloth                     Q  "+GrayCloth);
                    System.out.println("02.- Black Cloth                    Q. "+BlackCloth);
                    System.out.println("03.- Black/Gray Cloth               Q. "+Black_GrayCloth);
                    System.out.println("04.- Red/Black Suede Effect-Fabric  Q. "+Red_BlackSuedeEffectFabric);
                    System.out.println("Seleccione el color del Vehiculo: ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN");
                    System.out.println("Sedan            Q. "+Sedan);
                    System.out.println("Gray Cloth       Q.     "+GrayCloth);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("Black Cloth      Q.     "+BlackCloth);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán              Q. "+Sedan);
                    System.out.println("Black/Gray Cloth   Q.     "+Black_GrayCloth);
                    System.out.println("Total a pagar :    Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                          Q. "+Sedan);
                    System.out.println("Red/Black Suede Effect-Fabric  Q.     "+Red_BlackSuedeEffectFabric);
                    System.out.println("Total a pagar :                Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                                 break;         //TERCERA AMENIDAD
                                 
                             case 4: //CUARTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Tipos de Aros");
                    System.out.println("1.- Aro de 15 pulgadas  Q.    "+pulgadas_15);
                    System.out.println("2.- Aro de 16 pulgadas  Q.    "+pulgadas_16);
                    System.out.println("3.- Aro de 17 pulgadas  Q. "+pulgadas_17);
                    System.out.println("4.- Aro de 18 pulgadas  Q. "+pulgadas_18);
                    System.out.println("5.- Aro de 19 pulgadas  Q. "+pulgadas_19);
                    System.out.println("Selecciones el tamaño del Aro: ");
                    opcion = sn.nextInt();
                     switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedan            Q. "+Sedan);
                    System.out.println("15 pulgadas      Q.     "+pulgadas_15);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán            Q. "+Sedan);
                    System.out.println("16 pulgadas      Q.     "+pulgadas_16);
                    System.out.println("Total a pagar :  Q. "+Sedan);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán              Q. "+Sedan);
                    System.out.println("17 pulgadas        Q.  "+pulgadas_17);
                    System.out.println("Total a pagar :    Q. "+total35);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("18 pulgadas          Q.  "+pulgadas_18);
                    System.out.println("Total a pagar :      Q. "+total36);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("19 pulgadas          Q.  "+pulgadas_19);
                    System.out.println("Total a pagar :      Q. "+total37);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                     }
                                 break; // CUARTA AMENIDAD
                                 
                             case 5: //QUINTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Accesorios Exteriores");
                    System.out.println("1.- Body Side Molding                 Q."+BodySideMolding);
                    System.out.println("2.- Car Cover                         Q."+CarCover);
                    System.out.println("3.- Decklid Spoiler                   Q."+DecklidSpoiler);
                    System.out.println("4.- Door Edge Film                    Q. "+DoorEdgeFilm);
                    System.out.println("5.- Door Edge Guards                  Q. "+DoorEdgeGuards);
                    System.out.println("6.- Door Trim Chrome                  Q."+DoorTrimChrome);
                    System.out.println("7.- Door Visor                        Q."+DoorVisor);
                    System.out.println("8.- Front Fender Emblems              Q. "+FrontFenderEmblems);
                    System.out.println("9.- Rear Bumper Applique              Q. "+RearBumperApplique);
                    System.out.println("10.- Fog Lights                       Q."+FogLights);
                    System.out.println("11.- Nose Mascs                       Q."+NoseMascs);
                    System.out.println("12.- Moonrof Visor                    Q."+MoonrofVisor);
                    System.out.println("13.- Splash Guard Set                 Q."+SplashGuardSet);
                    System.out.println("14.- Dust Cover                       Q."+DustCover);
                    System.out.println("15.- Door Mirror Cover - Carbon Fiber Q."+DoorMirrorCoverCarbonFiber);
                    System.out.println("Seleccione el Accesorio exterior que desee: ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("Body Side Molding    Q.   "+BodySideMolding);
                    System.out.println("Total a pagar :      Q. "+total38);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("Car Cover            Q.   "+CarCover);
                    System.out.println("Total a pagar :      Q. "+total39);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("Decklid Spoiler      Q.   "+DecklidSpoiler);
                    System.out.println("Total a pagar :      Q. "+total40);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("Door Edge Film       Q.    "+DoorEdgeFilm);
                    System.out.println("Total a pagar :      Q. "+total41);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("Door Edge Guards     Q.    "+DoorEdgeGuards);
                    System.out.println("Total a pagar :      Q. "+total42);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("Door Trim Chrome     Q.   "+DoorTrimChrome);
                    System.out.println("Total a pagar :      Q. "+total43);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("Door Visor           Q.   "+DoorVisor);
                    System.out.println("Total a pagar :      Q. "+total44);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                  Q. "+Sedan);
                    System.out.println("Front Fender Emblems   Q.    "+FrontFenderEmblems);
                    System.out.println("Total a pagar :        Q. "+total45);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                   Q. "+Sedan);
                    System.out.println("Rear Bumper Applique   Q.    "+RearBumperApplique);
                    System.out.println("Total a pagar :        Q. "+total46);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán              Q. "+Sedan);
                    System.out.println("Fog Lights         Q.   "+FogLights);
                    System.out.println("Total a pagar :    Q. "+total47);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán              Q. "+Sedan);
                    System.out.println("Nose Mascs         Q.   "+NoseMascs);
                    System.out.println("Total a pagar :    Q. "+total48);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán              Q. "+Sedan);
                    System.out.println("Moonrof Visor      Q.   "+MoonrofVisor);
                    System.out.println("Total a pagar :    Q. "+total49);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                        break;
                           
                        case 13:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("Splash Guard Set     Q.   "+SplashGuardSet);
                    System.out.println("Total a pagar :      Q. "+total50);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 14:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán              Q. "+Sedan);
                    System.out.println("Dust Cover         Q.   "+DustCover);
                    System.out.println("Total a pagar :    Q. "+total51);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                            
                        case 15:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                            Q. "+Sedan);
                    System.out.println("Door Mirror Cover-Carbon Fiber   Q.   "+DoorMirrorCoverCarbonFiber);
                    System.out.println("Total a pagar :                  Q. "+total52);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;           
                    }
                                 break;// QUINTA AMENIDAD
                                 
                             case 6: //SEXTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Accesorios Interiores");
                    System.out.println("1.- BAll-Seasons Floor Mats        Q."+All_SeasonFloorMats);
                    System.out.println("2.- Automatic-Dimming Mirror       Q."+Automatic_DimmingMirror);
                    System.out.println("3.- Cargo Hook                     Q. "+CargoHook);
                    System.out.println("4.- Cargo Net                      Q. "+CargoNet);
                    System.out.println("5.- Console Illumination           Q."+ConsoleIllumination);
                    System.out.println("6.- Cargo Organizer                Q. "+CargoOrganizer);
                    System.out.println("7.- Door Panel Protector           Q."+DoorPanelProtector);
                    System.out.println("8.- Armrest Compartiment           Q."+ArmrestCompartiment);
                    System.out.println("9.- Door Sill Trim-Illuminated     Q."+DoorSillTrim_Illuminated);
                    System.out.println("10.- Cargo Cover                   Q."+CargoCover);
                    System.out.println("11.- Cargo Liner                   Q."+CargoLiner);
                    System.out.println("Seleccione el Accesorio Interior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                    Q. "+Sedan);
                    System.out.println("All-Seasons Floor Mats   Q.   "+All_SeasonFloorMats);
                    System.out.println("Total a pagar :          Q. "+total53);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                      Q. "+Sedan);
                    System.out.println("Automatic-Dimming Mirror   Q.   "+Automatic_DimmingMirror);
                    System.out.println("Total a pagar :            Q. "+total54);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán               Q. "+Sedan);
                    System.out.println("Cargo Hook          Q.    "+CargoHook);
                    System.out.println("Total a pagar :     Q. "+total55);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán               Q. "+Sedan);
                    System.out.println("Cargo Net           Q.    "+CargoNet);
                    System.out.println("Total a pagar :     Q. "+total56);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                   Q. "+Sedan);
                    System.out.println("Console Illumination    Q.   "+ConsoleIllumination);
                    System.out.println("Total a pagar :         Q. "+total57);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                Q. "+Sedan);
                    System.out.println("Cargo Organizer      Q.   "+CargoOrganizer);
                    System.out.println("Total a pagar :      Q. "+total58);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                   Q. "+Sedan);
                    System.out.println("Door Panel Protector    Q.   "+DoorPanelProtector);
                    System.out.println("Total a pagar :         Q. "+total59);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                  Q. "+Sedan);
                    System.out.println("Armrest Compartiment   Q.   "+ArmrestCompartiment);
                    System.out.println("Total a pagar :        Q. "+total60);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                         Q. "+Sedan);
                    System.out.println("Door Sill Trim-Illuminated    Q.   "+DoorSillTrim_Illuminated);
                    System.out.println("Total a pagar :               Q. "+total61);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán              Q. "+Sedan);
                    System.out.println("Cargo Cover        Q.   "+CargoCover);
                    System.out.println("Total a pagar :    Q. "+total62);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán              Q. "+Sedan);
                    System.out.println("Cargo Liner        Q.   "+CargoLiner);
                    System.out.println("Total a pagar :    Q. "+total63);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                    }
                                 break; // SEXTA AMENIDAD
     
                             case 7: // SEPTIMA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Accesorios Eletrónicos");
                    System.out.println("1.-Wireless Phone Charger Q."+WirelllesPhoneCharger);
                    System.out.println("2.-USB Charger - 2.1 Amp. Q."+USBCharger_2Amp);
                    System.out.println("3.-Puddle Light           Q."+PuddleLight);
                    System.out.println("4.-Parking Sensors        Q."+ParkingSensors);
                    System.out.println("Seleccione el Accesorio Electrónico: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                      case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                    Q. "+Sedan);
                    System.out.println("Wireless Phone Charger   Q.   "+WirelllesPhoneCharger);
                    System.out.println("Total a pagar :          Q. "+total64);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán                     Q. "+Sedan);
                    System.out.println("USB Charger - 2.1 Amp.    Q.   "+USBCharger_2Amp);
                    System.out.println("Total a pagar :           Q. "+total65);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán               Q. "+Sedan);
                    System.out.println("Puddle Light        Q.    "+PuddleLight);
                    System.out.println("Total a pagar :     Q. "+total66);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: SEDÁN ");
                    System.out.println("Sedán               Q. "+Sedan);
                    System.out.println("Parking Sensors     Q.   "+ParkingSensors);
                    System.out.println("Total a pagar :     Q. "+total67);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;  
                    }
                                 break; // SEPTIMA AMENIDAD
                    }//FINALIZA PIRMERA AMENIDAD
                    }
                            break;
                            
                            case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println(" USTED SELECCIONO NO AGREGAR NINGUNA AMENIDAD");
                    System.out.println("Gama seleccionada: SEDÁN    Q."+Sedan);
                    System.out.println("Amenidades: Ninguna         Q.    "+Ninguno);
                    System.out.println("Total a Pagar:               Q."+Sedan);
                    System.out.println("Digite el Numero 2 para Regresar"); 
                    opcion = sn.nextInt();
                            break;
                    } // PRIMER SWITCH DEL VEHICULO SEDAN
                            break; // MENU DEL SEGUNDO VEHICULO
                            
                            case 3: //MENU DEL TERCER VEHICULO
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("¿Desea agregar amenidades?");
                    System.out.println("1.  SI DESEO AGREGAR AMENIDADES ");
                    System.out.println("2.  NO AGREGAR NINGUNA AMENIDAD ");
                    System.out.println(" Introduzca su Opcion Por Favor\n  1. SI\n  2. NO ");
                    opcion = sn.nextInt(); 
                    
                    switch (opcion){ //PRIMER SWITCH DEL VEHICULO DEPORTIVO DEL TERCER VEHICULO
                        case 1:
                            //INICIA LA PRUEBA
                            switch (opcion){ // TERCER SWITCH DEL PRIMERO
                        case 1: // PRIMER CASO DEL TERCER SWITCH AMENIDADES
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:DEPORTIVO");
                    System.out.println(" Tipos de Amenidades :");
                    System.out.println("01.- Tipo de transmisión");
                    System.out.println("02.- Color de pintura exterior");
                    System.out.println("03.- Color de Tapiceria");
                    System.out.println("04.- Aros");
                    System.out.println("05.- Accesorios exteriores");
                    System.out.println("06.- Accesorios interiores");
                    System.out.println("07.- Accesorios electrónicos");
                    System.out.println("Ingrese el tipo de amenidad Por Favor: ");
                    opcion = sn.nextInt();
                    
                    //SE EMPEZARA CON LAS AMENIDADES
                    switch (opcion){ //INICIA PRIMERA AMENIDAD
                        case 1:  //
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Tipos de Transmisión: ");
                    System.out.println("01.- Manual            Q.  "+Manual);
                    System.out.println("02.- CVT               Q."+CVT);
                    System.out.println("03.- Manual con Turbo  Q.  "+ManualConTurbo);
                    System.out.println("04.- CVT con Turbo     Q."+CVTConTurbo);
                    System.out.println(" Ingrese el tipo de transmisión: ");
                    opcion =sn.nextInt(); 
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Manual           Q.     "+Manual);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("CVT              Q.   "+CVT);
                    System.out.println("Total a pagar :  Q. "+total68);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo          Q. "+Deportivo);
                    System.out.println("Manual con Turbo   Q.     "+ManualConTurbo);
                    System.out.println("Total a pagar :    Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("CVT con Turbo    Q.   "+CVTConTurbo);
                    System.out.println("Total a pagar :  Q. "+total69);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                            break; // PRIMERA AMENIDAD
                            
                             case 2: //SEGUNDA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Color de pintura Exterior");
                    System.out.println("01.- Cosmic Blue         Q. "+CosmicBlue); 
                    System.out.println("02.- Burgundy Night      Q. "+BurgundyNight);        
                    System.out.println("03.- Rallye Red          Q. "+RallyeRed);
                    System.out.println("04.- Crystal Black       Q. "+CrystalBlack);
                    System.out.println("05.- Modern Steel        Q. "+ModernSteel);
                    System.out.println("06.- TaffetaWhile        Q. "+TaffetaWhile);
                    System.out.println("07.- Energy Green        Q. "+EnergyGreen);
                    System.out.println("08.- Kona Coffee         Q. "+KonaCoffee);
                    System.out.println("09.- Orange Fury         Q. "+OrangeFury);
                    System.out.println("10.- Helios Yellow       Q. "+HeliosYellow);
                    System.out.println("11.- Sonic Gray          Q. "+SonicGray);
                    System.out.println("12.- Polished Metal      Q. "+PolishedMetal);
                    System.out.println(" Ingrese el tipo de color de pintura exterior: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Cosmic Blue      Q.     "+CosmicBlue);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo         Q. "+Deportivo);
                    System.out.println("Burgundy Night    Q.     "+BurgundyNight);
                    System.out.println("Total a pagar :   Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo          Q. "+Deportivo);
                    System.out.println("Rallye Red         Q.     "+RallyeRed);
                    System.out.println("Total a pagar :    Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Crystal Black    Q.     "+CrystalBlack);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Modern Steel     Q.     "+ModernSteel);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Taffeta While    Q.     "+TaffetaWhile);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Energy Green     Q.     "+EnergyGreen);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Kona Coffee      Q.     "+KonaCoffee);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Orange Fury      Q.     "+OrangeFury);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Helios Yellow    Q.     "+HeliosYellow);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                              break;
                    
                    case 11:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Sonic Gray       Q.     "+SonicGray);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Polished Metal   Q.     "+PolishedMetal);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                    break; //SEGUNDA AMENIDAD
                    
                             case 3: //TERCERA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Color de tapiceria");
                    System.out.println("01.- Gray Cloth                     Q  "+GrayCloth);
                    System.out.println("02.- Black Cloth                    Q. "+BlackCloth);
                    System.out.println("03.- Black/Gray Cloth               Q. "+Black_GrayCloth);
                    System.out.println("04.- Red/Black Suede Effect-Fabric  Q. "+Red_BlackSuedeEffectFabric);
                    System.out.println("Seleccione el color del Vehiculo: ");
                    opcion = sn.nextInt();
                    switch(opcion){
                         case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Gray Cloth       Q.     "+GrayCloth);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("Black Cloth      Q.     "+BlackCloth);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo          Q. "+Deportivo);
                    System.out.println("Black/Gray Cloth   Q.     "+Black_GrayCloth);
                    System.out.println("Total a pagar :    Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo                      Q. "+Deportivo);
                    System.out.println("Red/Black Suede Effect-Fabric  Q.     "+Red_BlackSuedeEffectFabric);
                    System.out.println("Total a pagar :                Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                                 break;         //TERCERA AMENIDAD
                                 
                             case 4: //CUARTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Tipos de Aros");
                    System.out.println("1.- Aro de 15 pulgadas  Q.    "+pulgadas_15);
                    System.out.println("2.- Aro de 16 pulgadas  Q.    "+pulgadas_16);
                    System.out.println("3.- Aro de 17 pulgadas  Q. "+pulgadas_17);
                    System.out.println("4.- Aro de 18 pulgadas  Q. "+pulgadas_18);
                    System.out.println("5.- Aro de 19 pulgadas  Q. "+pulgadas_19);
                    System.out.println("Selecciones el tamaño del Aro: ");
                    opcion = sn.nextInt();
                      switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("15 pulgadas      Q.     "+pulgadas_15);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo        Q. "+Deportivo);
                    System.out.println("16 pulgadas      Q.     "+pulgadas_16);
                    System.out.println("Total a pagar :  Q. "+Deportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo          Q. "+Deportivo);
                    System.out.println("17 pulgadas        Q.  "+pulgadas_17);
                    System.out.println("Total a pagar :    Q. "+total70);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("18 pulgadas          Q.  "+pulgadas_18);
                    System.out.println("Total a pagar :      Q. "+total71);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("19 pulgadas          Q.  "+pulgadas_19);
                    System.out.println("Total a pagar :      Q. "+total72);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                     }
                                 break; // CUARTA AMENIDAD
                                 
                             case 5: //QUINTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Accesorios Exteriores");
                    System.out.println("1.- Body Side Molding                 Q."+BodySideMolding);
                    System.out.println("2.- Car Cover                         Q."+CarCover);
                    System.out.println("3.- Decklid Spoiler                   Q."+DecklidSpoiler);
                    System.out.println("4.- Door Edge Film                    Q. "+DoorEdgeFilm);
                    System.out.println("5.- Door Edge Guards                  Q. "+DoorEdgeGuards);
                    System.out.println("6.- Door Trim Chrome                  Q."+DoorTrimChrome);
                    System.out.println("7.- Door Visor                        Q."+DoorVisor);
                    System.out.println("8.- Front Fender Emblems              Q. "+FrontFenderEmblems);
                    System.out.println("9.- Rear Bumper Applique              Q. "+RearBumperApplique);
                    System.out.println("10.- Fog Lights                       Q."+FogLights);
                    System.out.println("11.- Nose Mascs                       Q."+NoseMascs);
                    System.out.println("12.- Moonrof Visor                    Q."+MoonrofVisor);
                    System.out.println("13.- Splash Guard Set                 Q."+SplashGuardSet);
                    System.out.println("14.- Dust Cover                       Q."+DustCover);
                    System.out.println("15.- Door Mirror Cover - Carbon Fiber Q."+DoorMirrorCoverCarbonFiber);
                    System.out.println("Seleccione el Accesorio exterior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("Body Side Molding    Q.   "+BodySideMolding);
                    System.out.println("Total a pagar :      Q. "+total73);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("Car Cover            Q.   "+CarCover);
                    System.out.println("Total a pagar :      Q. "+total74);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("Decklid Spoiler      Q.   "+DecklidSpoiler);
                    System.out.println("Total a pagar :      Q. "+total75);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("Door Edge Film       Q.    "+DoorEdgeFilm);
                    System.out.println("Total a pagar :      Q. "+total76);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("Door Edge Guards     Q.    "+DoorEdgeGuards);
                    System.out.println("Total a pagar :      Q. "+total77);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("Door Trim Chrome     Q.   "+DoorTrimChrome);
                    System.out.println("Total a pagar :      Q. "+total78);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("Door Visor           Q.   "+DoorVisor);
                    System.out.println("Total a pagar :      Q. "+total79);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo              Q. "+Deportivo);
                    System.out.println("Front Fender Emblems   Q.    "+FrontFenderEmblems);
                    System.out.println("Total a pagar :        Q. "+total80);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo              Q. "+Deportivo);
                    System.out.println("Rear Bumper Applique   Q.    "+RearBumperApplique);
                    System.out.println("Total a pagar :        Q. "+total81);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo          Q. "+Deportivo);
                    System.out.println("Fog Lights         Q.   "+FogLights);
                    System.out.println("Total a pagar :    Q. "+total82);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo          Q. "+Deportivo);
                    System.out.println("Nose Mascs         Q.   "+NoseMascs);
                    System.out.println("Total a pagar :    Q. "+total83);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo          Q. "+Deportivo);
                    System.out.println("Moonrof Visor      Q.   "+MoonrofVisor);
                    System.out.println("Total a pagar :    Q. "+total84);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                        break;
                           
                        case 13:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("Splash Guard Set     Q.   "+SplashGuardSet);
                    System.out.println("Total a pagar :      Q. "+total85);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 14:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo          Q. "+Deportivo);
                    System.out.println("Dust Cover         Q.   "+DustCover);
                    System.out.println("Total a pagar :    Q. "+total86);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                            
                        case 15:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo                        Q. "+Deportivo);
                    System.out.println("Door Mirror Cover-Carbon Fiber   Q.   "+DoorMirrorCoverCarbonFiber);
                    System.out.println("Total a pagar :                  Q. "+total87);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;           
                    }
                                 break;// QUINTA AMENIDAD
                                 
                             case 6: //SEXTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Accesorios Interiores");
                    System.out.println("1.- All-Seasons Floor Mats         Q."+All_SeasonFloorMats);
                    System.out.println("2.- Automatic-Dimming Mirror       Q."+Automatic_DimmingMirror);
                    System.out.println("3.- Cargo Hook                     Q. "+CargoHook);
                    System.out.println("4.- Cargo Net                      Q. "+CargoNet);
                    System.out.println("5.- Console Illumination           Q."+ConsoleIllumination);
                    System.out.println("6.- Cargo Organizer                Q. "+CargoOrganizer);
                    System.out.println("7.- Door Panel Protector           Q."+DoorPanelProtector);
                    System.out.println("8.- Armrest Compartiment           Q."+ArmrestCompartiment);
                    System.out.println("9.- Door Sill Trim-Illuminated     Q."+DoorSillTrim_Illuminated);
                    System.out.println("10.- Cargo Cover                   Q."+CargoCover);
                    System.out.println("11.- Cargo Liner                   Q."+CargoLiner);
                    System.out.println("Seleccione el Accesorio Interior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo                Q. "+Deportivo);
                    System.out.println("All-Seasons Floor Mats   Q.   "+All_SeasonFloorMats);
                    System.out.println("Total a pagar :          Q. "+total88);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo                  Q. "+Deportivo);
                    System.out.println("Automatic-Dimming Mirror   Q.   "+Automatic_DimmingMirror);
                    System.out.println("Total a pagar :            Q. "+total89);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo           Q. "+Deportivo);
                    System.out.println("Cargo Hook          Q.    "+CargoHook);
                    System.out.println("Total a pagar :     Q. "+total90);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo           Q. "+Deportivo);
                    System.out.println("Cargo Net           Q.    "+CargoNet);
                    System.out.println("Total a pagar :     Q. "+total91);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo               Q. "+Deportivo);
                    System.out.println("Console Illumination    Q.   "+ConsoleIllumination);
                    System.out.println("Total a pagar :         Q. "+total92);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo            Q. "+Deportivo);
                    System.out.println("Cargo Organizer      Q.   "+CargoOrganizer);
                    System.out.println("Total a pagar :      Q. "+total93);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo               Q. "+Deportivo);
                    System.out.println("Door Panel Protector    Q.   "+DoorPanelProtector);
                    System.out.println("Total a pagar :         Q. "+total94);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo              Q. "+Deportivo);
                    System.out.println("Armrest Compartiment   Q.   "+ArmrestCompartiment);
                    System.out.println("Total a pagar :        Q. "+total95);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo                     Q. "+Deportivo);
                    System.out.println("Door Sill Trim-Illuminated    Q.   "+DoorSillTrim_Illuminated);
                    System.out.println("Total a pagar :               Q. "+total96);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo          Q. "+Deportivo);
                    System.out.println("Cargo Cover        Q.   "+CargoCover);
                    System.out.println("Total a pagar :    Q. "+total97);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo          Q. "+Deportivo);
                    System.out.println("Cargo Liner        Q.   "+CargoLiner);
                    System.out.println("Total a pagar :    Q. "+total98);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                    }
                                 break; // SEXTA AMENIDAD
     
                             case 7: // SEPTIMA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Accesorios Eletrónicos");
                    System.out.println("1.-Wireless Phone Charger Q."+WirelllesPhoneCharger);
                    System.out.println("2.-USB Charger - 2.1 Amp. Q."+USBCharger_2Amp);
                    System.out.println("3.-Puddle Light           Q."+PuddleLight);
                    System.out.println("4.-Parking Sensors        Q."+ParkingSensors);
                    System.out.println("Seleccione el Accesorio Electrónico: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                      case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo                Q. "+Deportivo);
                    System.out.println("Wireless Phone Charger   Q.   "+WirelllesPhoneCharger);
                    System.out.println("Total a pagar :          Q. "+total99);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO ");
                    System.out.println("Deportivo                 Q. "+Deportivo);
                    System.out.println("USB Charger - 2.1 Amp.    Q.   "+USBCharger_2Amp);
                    System.out.println("Total a pagar :           Q. "+total100);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo           Q. "+Deportivo);
                    System.out.println("Puddle Light        Q.    "+PuddleLight);
                    System.out.println("Total a pagar :     Q. "+total101);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: DEPORTIVO");
                    System.out.println("Deportivo           Q. "+Deportivo);
                    System.out.println("Parking Sensors     Q.   "+ParkingSensors);
                    System.out.println("Total a pagar :     Q. "+total102);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;  
                    }
                                 break; // SEPTIMA AMENIDAD
                    }//FINALIZA PIRMERA AMENIDAD         
                    }
                            break;
                            
                            case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println(" USTED SELECCIONO NO AGREGAR NINGUNA AMENIDAD");
                    System.out.println("Gama seleccionada: DEPORTIVO       Q."+Deportivo);
                    System.out.println("Amenidades: Ninguna                Q.    "+Ninguno);
                    System.out.println("Total a Pagar:                     Q."+Deportivo);
                    System.out.println("Digite el Numero 2 para Regresar"); 
                    opcion = sn.nextInt();
                            break;
                    } // PRIMER SWITCH DEL VEHICULO DEPORTIVO DEL TERCER VEHIUCLO
                            break; // MENU DEL TERCER VEHICULO
                            
                            case 4: //MENU DEL CUARTO VEHICULO
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("¿Desea agregar amenidades?");
                    System.out.println("1.  SI DESEO AGREGAR AMENIDADES ");
                    System.out.println("2.  NO AGREGAR NINGUNA AMENIDAD ");
                    System.out.println(" Introduzca su Opcion Por Favor\n  1. SI\n  2. NO ");
                    opcion = sn.nextInt();  
                    
                    switch (opcion){ //PRIMER SWITCH DEL VEHICULO HIBRIDO CUARTO VEHICULO
                        case 1:
                            //INICIA LA PRUEBA
                            switch (opcion){ // TERCER SWITCH DEL PRIMERO
                        case 1: // PRIMER CASO DEL TERCER SWITCH AMENIDADES
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println(" Tipos de Amenidades :");
                    System.out.println("01.- Tipo de transmisión");
                    System.out.println("02.- Color de pintura exterior");
                    System.out.println("03.- Color de Tapiceria");
                    System.out.println("04.- Aros");
                    System.out.println("05.- Accesorios exteriores");
                    System.out.println("06.- Accesorios interiores");
                    System.out.println("07.- Accesorios electrónicos");
                    System.out.println("Ingrese el tipo de amenidad Por Favor: ");
                    opcion = sn.nextInt();
                    
                    //SE EMPEZARA CON LAS AMENIDADES
                    switch (opcion){ //INICIA PRIMERA AMENIDAD
                        case 1:  //
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Tipos de Transmisión: ");
                    System.out.println("01.- Manual            Q.  "+Manual);
                    System.out.println("02.- CVT               Q."+CVT);
                    System.out.println("03.- Manual con Turbo  Q.  "+ManualConTurbo);
                    System.out.println("04.- CVT con Turbo     Q."+CVTConTurbo);
                    System.out.println(" Ingrese el tipo de transmisión: ");
                    opcion =sn.nextInt(); 
                    switch (opcion){
                    case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HIBRIDO ");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Manual           Q.     "+Manual);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HIBRIDO ");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("CVT              Q.   "+CVT);
                    System.out.println("Total a pagar :  Q. "+total103);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HIBRIDO");
                    System.out.println("Hibrido            Q. "+Hibrido);
                    System.out.println("Manual con Turbo   Q.     "+ManualConTurbo);
                    System.out.println("Total a pagar :    Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HIBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("CVT con Turbo    Q.   "+CVTConTurbo);
                    System.out.println("Total a pagar :  Q. "+total104);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                            break; // PRIMERA AMENIDAD
                            
                             case 2: //SEGUNDA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Color de pintura Exterior");
                    System.out.println("01.- Cosmic Blue         Q. "+CosmicBlue); 
                    System.out.println("02.- Burgundy Night      Q. "+BurgundyNight);        
                    System.out.println("03.- Rallye Red          Q. "+RallyeRed);
                    System.out.println("04.- Crystal Black       Q. "+CrystalBlack);
                    System.out.println("05.- Modern Steel        Q. "+ModernSteel);
                    System.out.println("06.- TaffetaWhile        Q. "+TaffetaWhile);
                    System.out.println("07.- Energy Green        Q. "+EnergyGreen);
                    System.out.println("08.- Kona Coffee         Q. "+KonaCoffee);
                    System.out.println("09.- Orange Fury         Q. "+OrangeFury);
                    System.out.println("10.- Helios Yellow       Q. "+HeliosYellow);
                    System.out.println("11.- Sonic Gray          Q. "+SonicGray);
                    System.out.println("12.- Polished Metal      Q. "+PolishedMetal);
                    System.out.println(" Ingrese el tipo de color de pintura exterior: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Cosmic Blue      Q.     "+CosmicBlue);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido           Q. "+Hibrido);
                    System.out.println("Burgundy Night    Q.     "+BurgundyNight);
                    System.out.println("Total a pagar :   Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido            Q. "+Hibrido);
                    System.out.println("Rallye Red         Q.     "+RallyeRed);
                    System.out.println("Total a pagar :    Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Crystal Black    Q.     "+CrystalBlack);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Modern Steel     Q.     "+ModernSteel);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Taffeta While    Q.     "+TaffetaWhile);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Energy Green     Q.     "+EnergyGreen);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Kona Coffee      Q.     "+KonaCoffee);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Orange Fury      Q.     "+OrangeFury);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Helios Yellow    Q.     "+HeliosYellow);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                              break;
                    
                    case 11:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Sonic Gray       Q.     "+SonicGray);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Polished Metal   Q.     "+PolishedMetal);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                    break; //SEGUNDA AMENIDAD
                    
                             case 3: //TERCERA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Color de tapiceria");
                    System.out.println("01.- Gray Cloth                     Q  "+GrayCloth);
                    System.out.println("02.- Black Cloth                    Q. "+BlackCloth);
                    System.out.println("03.- Black/Gray Cloth               Q. "+Black_GrayCloth);
                    System.out.println("04.- Red/Black Suede Effect-Fabric  Q. "+Red_BlackSuedeEffectFabric);
                    System.out.println("Seleccione el color del Vehiculo: ");
                    opcion = sn.nextInt();
                       switch(opcion){
                         case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Gray Cloth       Q.     "+GrayCloth);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido          Q. "+Hibrido);
                    System.out.println("Black Cloth      Q.     "+BlackCloth);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido            Q. "+Hibrido);
                    System.out.println("Black/Gray Cloth   Q.     "+Black_GrayCloth);
                    System.out.println("Total a pagar :    Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido                        Q. "+Hibrido);
                    System.out.println("Red/Black Suede Effect-Fabric  Q.     "+Red_BlackSuedeEffectFabric);
                    System.out.println("Total a pagar :                Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                                 break;         //TERCERA AMENIDAD
                                 
                             case 4: //CUARTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Tipos de Aros");
                    System.out.println("1.- Aro de 15 pulgadas  Q.    "+pulgadas_15);
                    System.out.println("2.- Aro de 16 pulgadas  Q.    "+pulgadas_16);
                    System.out.println("3.- Aro de 17 pulgadas  Q. "+pulgadas_17);
                    System.out.println("4.- Aro de 18 pulgadas  Q. "+pulgadas_18);
                    System.out.println("5.- Aro de 19 pulgadas  Q. "+pulgadas_19);
                    System.out.println("Selecciones el tamaño del Aro: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido          Q. "+Hibrido );
                    System.out.println("15 pulgadas      Q.     "+pulgadas_15);
                    System.out.println("Total a pagar :  Q. "+Hibrido );
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido          Q. "+Hibrido );
                    System.out.println("16 pulgadas      Q.     "+pulgadas_16);
                    System.out.println("Total a pagar :  Q. "+Hibrido);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido            Q. "+Hibrido);
                    System.out.println("17 pulgadas        Q.  "+pulgadas_17);
                    System.out.println("Total a pagar :    Q. "+total105);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido              Q. "+Hibrido );
                    System.out.println("18 pulgadas          Q.  "+pulgadas_18);
                    System.out.println("Total a pagar :      Q. "+total106);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido              Q. "+Hibrido );
                    System.out.println("19 pulgadas          Q.  "+pulgadas_19);
                    System.out.println("Total a pagar :      Q. "+total107);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                     }
                                 break; // CUARTA AMENIDAD
                                 
                             case 5: //QUINTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Accesorios Exteriores");
                    System.out.println("1.- Body Side Molding                 Q."+BodySideMolding);
                    System.out.println("2.- Car Cover                         Q."+CarCover);
                    System.out.println("3.- Decklid Spoiler                   Q."+DecklidSpoiler);
                    System.out.println("4.- Door Edge Film                    Q. "+DoorEdgeFilm);
                    System.out.println("5.- Door Edge Guards                  Q. "+DoorEdgeGuards);
                    System.out.println("6.- Door Trim Chrome                  Q."+DoorTrimChrome);
                    System.out.println("7.- Door Visor                        Q."+DoorVisor);
                    System.out.println("8.- Front Fender Emblems              Q. "+FrontFenderEmblems);
                    System.out.println("9.- Rear Bumper Applique              Q. "+RearBumperApplique);
                    System.out.println("10.- Fog Lights                       Q."+FogLights);
                    System.out.println("11.- Nose Mascs                       Q."+NoseMascs);
                    System.out.println("12.- Moonrof Visor                    Q."+MoonrofVisor);
                    System.out.println("13.- Splash Guard Set                 Q."+SplashGuardSet);
                    System.out.println("14.- Dust Cover                       Q."+DustCover);
                    System.out.println("15.- Door Mirror Cover - Carbon Fiber Q."+DoorMirrorCoverCarbonFiber);
                    System.out.println("Seleccione el Accesorio exterior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido              Q. "+Deportivo);
                    System.out.println("Body Side Molding    Q.   "+BodySideMolding);
                    System.out.println("Total a pagar :      Q. "+total108);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:HÍBRIDO ");
                    System.out.println("Hibrido              Q. "+Hibrido);
                    System.out.println("Car Cover            Q.   "+CarCover);
                    System.out.println("Total a pagar :      Q. "+total109);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:HÍBRIDO ");
                    System.out.println("Hibrido              Q. "+Hibrido);
                    System.out.println("Decklid Spoiler      Q.   "+DecklidSpoiler);
                    System.out.println("Total a pagar :      Q. "+total110);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido              Q. "+Hibrido);
                    System.out.println("Door Edge Film       Q.    "+DoorEdgeFilm);
                    System.out.println("Total a pagar :      Q. "+total111);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido              Q. "+Hibrido);
                    System.out.println("Door Edge Guards     Q.    "+DoorEdgeGuards);
                    System.out.println("Total a pagar :      Q. "+total112);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido              Q. "+Hibrido);
                    System.out.println("Door Trim Chrome     Q.   "+DoorTrimChrome);
                    System.out.println("Total a pagar :      Q. "+total113);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido              Q. "+Hibrido);
                    System.out.println("Door Visor           Q.   "+DoorVisor);
                    System.out.println("Total a pagar :      Q. "+total114);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("DHibrido               Q. "+Hibrido);
                    System.out.println("Front Fender Emblems   Q.    "+FrontFenderEmblems);
                    System.out.println("Total a pagar :        Q. "+total115);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:HÍBRIDO ");
                    System.out.println("Hibrido                Q. "+Hibrido);
                    System.out.println("Rear Bumper Applique   Q.    "+RearBumperApplique);
                    System.out.println("Total a pagar :        Q. "+total116);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido            Q. "+Hibrido);
                    System.out.println("Fog Lights         Q.   "+FogLights);
                    System.out.println("Total a pagar :    Q. "+total117);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido            Q. "+Hibrido);
                    System.out.println("Nose Mascs         Q.   "+NoseMascs);
                    System.out.println("Total a pagar :    Q. "+total118);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido            Q. "+Hibrido);
                    System.out.println("Moonrof Visor      Q.   "+MoonrofVisor);
                    System.out.println("Total a pagar :    Q. "+total119);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                        break;
                           
                        case 13:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido              Q. "+Hibrido);
                    System.out.println("Splash Guard Set     Q.   "+SplashGuardSet);
                    System.out.println("Total a pagar :      Q. "+total120);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 14:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido            Q. "+Hibrido);
                    System.out.println("Dust Cover         Q.   "+DustCover);
                    System.out.println("Total a pagar :    Q. "+total121);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                            
                        case 15:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido                          Q. "+Hibrido);
                    System.out.println("Door Mirror Cover-Carbon Fiber   Q.   "+DoorMirrorCoverCarbonFiber);
                    System.out.println("Total a pagar :                  Q. "+total122);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;           
                    }
                                 break;// QUINTA AMENIDAD
                                 
                             case 6: //SEXTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Accesorios Interiores");
                    System.out.println("1.-  All-Seasons Floor Mats        Q."+All_SeasonFloorMats);
                    System.out.println("2.- Automatic-Dimming Mirror       Q."+Automatic_DimmingMirror);
                    System.out.println("3.- Cargo Hook                     Q. "+CargoHook);
                    System.out.println("4.- Cargo Net                      Q. "+CargoNet);
                    System.out.println("5.- Console Illumination           Q."+ConsoleIllumination);
                    System.out.println("6.- Cargo Organizer                Q. "+CargoOrganizer);
                    System.out.println("7.- Door Panel Protector           Q."+DoorPanelProtector);
                    System.out.println("8.- Armrest Compartiment           Q."+ArmrestCompartiment);
                    System.out.println("9.-  Door Sill Trim-Illuminated    Q."+DoorSillTrim_Illuminated);
                    System.out.println("10.- Cargo Cover                   Q."+CargoCover);
                    System.out.println("11.- Cargo Liner                   Q."+CargoLiner);
                    System.out.println("Seleccione el Accesorio Interior que desee: ");
                    opcion = sn.nextInt();
                     switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido                  Q. "+Hibrido);
                    System.out.println("All-Seasons Floor Mats   Q.   "+All_SeasonFloorMats);
                    System.out.println("Total a pagar :          Q. "+total123);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido                    Q. "+Hibrido);
                    System.out.println("Automatic-Dimming Mirror   Q.   "+Automatic_DimmingMirror);
                    System.out.println("Total a pagar :            Q. "+total124);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido             Q. "+Hibrido);
                    System.out.println("Cargo Hook          Q.    "+CargoHook);
                    System.out.println("Total a pagar :     Q. "+total125);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido             Q. "+Hibrido);
                    System.out.println("Cargo Net           Q.    "+CargoNet);
                    System.out.println("Total a pagar :     Q. "+total126);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido                 Q. "+Hibrido);
                    System.out.println("Console Illumination    Q.   "+ConsoleIllumination);
                    System.out.println("Total a pagar :         Q. "+total127);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido              Q. "+Hibrido);
                    System.out.println("Cargo Organizer      Q.   "+CargoOrganizer);
                    System.out.println("Total a pagar :      Q. "+total128);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido                 Q. "+Hibrido);
                    System.out.println("Door Panel Protector    Q.   "+DoorPanelProtector);
                    System.out.println("Total a pagar :         Q. "+total129);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido                Q. "+Hibrido);
                    System.out.println("Armrest Compartiment   Q.   "+ArmrestCompartiment);
                    System.out.println("Total a pagar :        Q. "+total130);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido                       Q. "+Hibrido );
                    System.out.println("Door Sill Trim-Illuminated    Q.   "+DoorSillTrim_Illuminated);
                    System.out.println("Total a pagar :               Q. "+total131);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido            Q. "+Hibrido );
                    System.out.println("Cargo Cover        Q.   "+CargoCover);
                    System.out.println("Total a pagar :    Q. "+total132);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO");
                    System.out.println("Hibrido            Q. "+Hibrido );
                    System.out.println("Cargo Liner        Q.   "+CargoLiner);
                    System.out.println("Total a pagar :    Q. "+total133);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                    }
                                 break; // SEXTA AMENIDAD
     
                             case 7: // SEPTIMA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Accesorios Eletrónicos");
                    System.out.println("1.-Wireless Phone Charger Q."+WirelllesPhoneCharger);
                    System.out.println("2.-USB Charger - 2.1 Amp. Q."+USBCharger_2Amp);
                    System.out.println("3.-Puddle Light           Q."+PuddleLight);
                    System.out.println("4.-Parking Sensors        Q."+ParkingSensors);
                    System.out.println("Seleccione el Accesorio Electrónico: ");
                    opcion = sn.nextInt();
                     switch (opcion){
                      case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO  ");
                    System.out.println("Hibrido                  Q. "+Hibrido );
                    System.out.println("Wireless Phone Charger   Q.   "+WirelllesPhoneCharger);
                    System.out.println("Total a pagar :          Q. "+total134);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO  ");
                    System.out.println("Hibrido                   Q. "+Hibrido );
                    System.out.println("USB Charger - 2.1 Amp.    Q.   "+USBCharger_2Amp);
                    System.out.println("Total a pagar :           Q. "+total135);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido             Q. "+Hibrido );
                    System.out.println("Puddle Light        Q.    "+PuddleLight);
                    System.out.println("Total a pagar :     Q. "+total136);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HÍBRIDO ");
                    System.out.println("Hibrido             Q. "+Hibrido );
                    System.out.println("Parking Sensors     Q.   "+ParkingSensors);
                    System.out.println("Total a pagar :     Q. "+total137);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;  
                    }
                                 break; // SEPTIMA AMENIDAD
                    }//FINALIZA PIRMERA AMENIDAD
                    }
                            break;
                            
                            case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println(" USTED SELECCIONO NO AGREGAR NINGUNA AMENIDAD");
                    System.out.println("Gama seleccionada: HÍBRIDO        Q. "+Hibrido);
                    System.out.println("Amenidades: Ninguna               Q.     "+Ninguno);
                    System.out.println("Total a Pagar:                    Q. "+Hibrido);
                    System.out.println("Digite el Numero 2 para Regresar"); 
                    opcion = sn.nextInt();
                            break;    
                    } // PRIMER SWITCH DEL VEHICULO HIBRIDO CUARTO VEHICULO
                            break; //MENU DEL CUARTO VEHICULO
                            
                            case 5: //MENU DEL QUINTO VEHICULO
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("¿Desea agregar amenidades?");
                    System.out.println("1.  SI DESEO AGREGAR AMENIDADES ");
                    System.out.println("2.  NO AGREGAR NINGUNA AMENIDAD ");
                    System.out.println(" Introduzca su Opcion Por Favor\n  1. SI\n  2. NO ");
                    opcion = sn.nextInt(); 
                    
                    switch (opcion){ //PRIMER SWITCH DEL VEHICULO COUPE QUINTO VEHICULO
                        case 1:
                            //INICIA LA PRUEBA
                            switch (opcion){ // TERCER SWITCH DEL PRIMERO
                        case 1: // PRIMER CASO DEL TERCER SWITCH AMENIDADES
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println(" Tipos de Amenidades :");
                    System.out.println("01.- Tipo de transmisión");
                    System.out.println("02.- Color de pintura exterior");
                    System.out.println("03.- Color de Tapiceria");
                    System.out.println("04.- Aros");
                    System.out.println("05.- Accesorios exteriores");
                    System.out.println("06.- Accesorios interiores");
                    System.out.println("07.- Accesorios electrónicos");
                    System.out.println("Ingrese el tipo de amenidad Por Favor: ");
                    opcion = sn.nextInt();
                    
                    //SE EMPEZARA CON LAS AMENIDADES
                    switch (opcion){ //INICIA PRIMERA AMENIDAD
                        case 1:  //
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Tipos de Transmisión: ");
                    System.out.println("01.- Manual            Q.  "+Manual);
                    System.out.println("02.- CVT               Q."+CVT);
                    System.out.println("03.- Manual con Turbo  Q.  "+ManualConTurbo);
                    System.out.println("04.- CVT con Turbo     Q."+CVTConTurbo);
                    System.out.println(" Ingrese el tipo de transmisión: ");
                    opcion =sn.nextInt();
                    switch (opcion){
                    case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COUPE  ");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Manual           Q.     "+Manual);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("CVT              Q.   "+CVT);
                    System.out.println("Total a pagar :  Q. "+total138);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe              Q. "+Coupe);
                    System.out.println("Manual con Turbo   Q.     "+ManualConTurbo);
                    System.out.println("Total a pagar :    Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("CVT con Turbo    Q.   "+CVTConTurbo);
                    System.out.println("Total a pagar :  Q. "+total139);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                            break; // PRIMERA AMENIDAD
                            
                             case 2: //SEGUNDA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Color de pintura Exterior");
                    System.out.println("01.- Cosmic Blue         Q. "+CosmicBlue); 
                    System.out.println("02.- Burgundy Night      Q. "+BurgundyNight);        
                    System.out.println("03.- Rallye Red          Q. "+RallyeRed);
                    System.out.println("04.- Crystal Black       Q. "+CrystalBlack);
                    System.out.println("05.- Modern Steel        Q. "+ModernSteel);
                    System.out.println("06.- TaffetaWhile        Q. "+TaffetaWhile);
                    System.out.println("07.- Energy Green        Q. "+EnergyGreen);
                    System.out.println("08.- Kona Coffee         Q. "+KonaCoffee);
                    System.out.println("09.- Orange Fury         Q. "+OrangeFury);
                    System.out.println("10.- Helios Yellow       Q. "+HeliosYellow);
                    System.out.println("11.- Sonic Gray          Q. "+SonicGray);
                    System.out.println("12.- Polished Metal      Q. "+PolishedMetal);
                    System.out.println(" Ingrese el tipo de color de pintura exterior: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Cosmic Blue      Q.     "+CosmicBlue);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe             Q. "+Coupe);
                    System.out.println("Burgundy Night    Q.     "+BurgundyNight);
                    System.out.println("Total a pagar :   Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe              Q. "+Coupe);
                    System.out.println("Rallye Red         Q.     "+RallyeRed);
                    System.out.println("Total a pagar :    Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Crystal Black    Q.     "+CrystalBlack);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Modern Steel     Q.     "+ModernSteel);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Taffeta While    Q.     "+TaffetaWhile);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Energy Green     Q.     "+EnergyGreen);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Kona Coffee      Q.     "+KonaCoffee);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Orange Fury      Q.     "+OrangeFury);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Helios Yellow    Q.     "+HeliosYellow);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                              break;
                    
                    case 11:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Sonic Gray       Q.     "+SonicGray);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Polished Metal   Q.     "+PolishedMetal);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                    break; //SEGUNDA AMENIDAD
                    
                             case 3: //TERCERA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Color de tapiceria");
                    System.out.println("01.- Gray Cloth                     Q  "+GrayCloth);
                    System.out.println("02.- Black Cloth                    Q. "+BlackCloth);
                    System.out.println("03.- Black/Gray Cloth               Q. "+Black_GrayCloth);
                    System.out.println("04.- Red/Black Suede Effect-Fabric  Q. "+Red_BlackSuedeEffectFabric);
                    System.out.println("Seleccione el color del Vehiculo: ");
                    opcion = sn.nextInt();
                       switch(opcion){
                         case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Gray Cloth       Q.     "+GrayCloth);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe            Q. "+Coupe);
                    System.out.println("Black Cloth      Q.     "+BlackCloth);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe              Q. "+Coupe);
                    System.out.println("Black/Gray Cloth   Q.     "+Black_GrayCloth);
                    System.out.println("Total a pagar :    Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe                          Q. "+Coupe);
                    System.out.println("Red/Black Suede Effect-Fabric  Q.     "+Red_BlackSuedeEffectFabric);
                    System.out.println("Total a pagar :                Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                                 break;         //TERCERA AMENIDAD
                                 
                             case 4: //CUARTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Tipos de Aros");
                    System.out.println("1.- Aro de 15 pulgadas  Q.    "+pulgadas_15);
                    System.out.println("2.- Aro de 16 pulgadas  Q.    "+pulgadas_16);
                    System.out.println("3.- Aro de 17 pulgadas  Q. "+pulgadas_17);
                    System.out.println("4.- Aro de 18 pulgadas  Q. "+pulgadas_18);
                    System.out.println("5.- Aro de 19 pulgadas  Q. "+pulgadas_19);
                    System.out.println("Selecciones el tamaño del Aro: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe            Q. "+Coupe );
                    System.out.println("15 pulgadas      Q.     "+pulgadas_15);
                    System.out.println("Total a pagar :  Q. "+Coupe );
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe            Q. "+Coupe );
                    System.out.println("16 pulgadas      Q.     "+pulgadas_16);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe              Q. "+Coupe);
                    System.out.println("17 pulgadas        Q.  "+pulgadas_17);
                    System.out.println("Total a pagar :    Q. "+total140);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe                Q. "+Coupe );
                    System.out.println("18 pulgadas          Q.  "+pulgadas_18);
                    System.out.println("Total a pagar :      Q. "+total141);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                Q. "+Coupe );
                    System.out.println("19 pulgadas          Q.  "+pulgadas_19);
                    System.out.println("Total a pagar :      Q. "+total142);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                     }
                                 break; // CUARTA AMENIDAD
                                 
                             case 5: //QUINTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Accesorios Exteriores");
                    System.out.println("1.- Body Side Molding                 Q."+BodySideMolding);
                    System.out.println("2.- Car Cover                         Q."+CarCover);
                    System.out.println("3.- Decklid Spoiler                   Q."+DecklidSpoiler);
                    System.out.println("4.- Door Edge Film                    Q. "+DoorEdgeFilm);
                    System.out.println("5.- Door Edge Guards                  Q. "+DoorEdgeGuards);
                    System.out.println("6.- Door Trim Chrome                  Q."+DoorTrimChrome);
                    System.out.println("7.- Door Visor                        Q."+DoorVisor);
                    System.out.println("8.- Front Fender Emblems              Q. "+FrontFenderEmblems);
                    System.out.println("9.- Rear Bumper Applique              Q. "+RearBumperApplique);
                    System.out.println("10.- Fog Lights                       Q."+FogLights);
                    System.out.println("11.- Nose Mascs                       Q."+NoseMascs);
                    System.out.println("12.- Moonrof Visor                    Q."+MoonrofVisor);
                    System.out.println("13.- Splash Guard Set                 Q."+SplashGuardSet);
                    System.out.println("14.- Dust Cover                       Q."+DustCover);
                    System.out.println("15.- Door Mirror Cover - Carbon Fiber Q."+DoorMirrorCoverCarbonFiber);
                    System.out.println("Seleccione el Accesorio exterior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                Q. "+Coupe);
                    System.out.println("Body Side Molding    Q.   "+BodySideMolding);
                    System.out.println("Total a pagar :      Q. "+total143);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COUPE ");
                    System.out.println("Coupe                Q. "+Coupe);
                    System.out.println("Car Cover            Q.   "+CarCover);
                    System.out.println("Total a pagar :      Q. "+total144);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:HÍBRIDO ");
                    System.out.println("Coupe                Q. "+Coupe);
                    System.out.println("Decklid Spoiler      Q.   "+DecklidSpoiler);
                    System.out.println("Total a pagar :      Q. "+total145);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                Q. "+Coupe);
                    System.out.println("Door Edge Film       Q.    "+DoorEdgeFilm);
                    System.out.println("Total a pagar :      Q. "+total146);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                Q. "+Coupe);
                    System.out.println("Door Edge Guards     Q.    "+DoorEdgeGuards);
                    System.out.println("Total a pagar :      Q. "+total147);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                Q. "+Coupe);
                    System.out.println("Door Trim Chrome     Q.   "+DoorTrimChrome);
                    System.out.println("Total a pagar :      Q. "+total148);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                Q. "+Coupe);
                    System.out.println("Door Visor           Q.   "+DoorVisor);
                    System.out.println("Total a pagar :      Q. "+total149);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                  Q. "+Coupe);
                    System.out.println("Front Fender Emblems   Q.    "+FrontFenderEmblems);
                    System.out.println("Total a pagar :        Q. "+total150);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COUPE ");
                    System.out.println("Coupe                  Q. "+Coupe);
                    System.out.println("Rear Bumper Applique   Q.    "+RearBumperApplique);
                    System.out.println("Total a pagar :        Q. "+total151);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe              Q. "+Coupe);
                    System.out.println("Fog Lights         Q.   "+FogLights);
                    System.out.println("Total a pagar :    Q. "+total152);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe              Q. "+Coupe);
                    System.out.println("Nose Mascs         Q.   "+NoseMascs);
                    System.out.println("Total a pagar :    Q. "+total153);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe              Q. "+Coupe);
                    System.out.println("Moonrof Visor      Q.   "+MoonrofVisor);
                    System.out.println("Total a pagar :    Q. "+total154);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                        break;
                           
                        case 13:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                Q. "+Coupe);
                    System.out.println("Splash Guard Set     Q.   "+SplashGuardSet);
                    System.out.println("Total a pagar :      Q. "+total155);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 14:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe              Q. "+Coupe);
                    System.out.println("Dust Cover         Q.   "+DustCover);
                    System.out.println("Total a pagar :    Q. "+total156);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                            
                        case 15:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                            Q. "+Coupe);
                    System.out.println("Door Mirror Cover-Carbon Fiber   Q.   "+DoorMirrorCoverCarbonFiber);
                    System.out.println("Total a pagar :                  Q. "+total157);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;           
                    }
                                 break;// QUINTA AMENIDAD
                                 
                             case 6: //SEXTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Accesorios Interiores");
                    System.out.println("1.- BAll-Seasons Floor Mats        Q."+All_SeasonFloorMats);
                    System.out.println("2.- Automatic-Dimming Mirror       Q."+Automatic_DimmingMirror);
                    System.out.println("3.- Cargo Hook                     Q. "+CargoHook);
                    System.out.println("4.- Cargo Net                      Q. "+CargoNet);
                    System.out.println("5.- Console Illumination           Q."+ConsoleIllumination);
                    System.out.println("6.- Cargo Organizer                Q. "+CargoOrganizer);
                    System.out.println("7.- Door Panel Protector           Q."+DoorPanelProtector);
                    System.out.println("8.- Armrest Compartiment           Q."+ArmrestCompartiment);
                    System.out.println("9.- RDoor Sill Trim-Illuminated    Q."+DoorSillTrim_Illuminated);
                    System.out.println("10.- Cargo Cover                   Q."+CargoCover);
                    System.out.println("11.- Cargo Liner                   Q."+CargoLiner);
                    System.out.println("Seleccione el Accesorio Interior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                    Q. "+Coupe);
                    System.out.println("All-Seasons Floor Mats   Q.   "+All_SeasonFloorMats);
                    System.out.println("Total a pagar :          Q. "+total158);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                      Q. "+Coupe);
                    System.out.println("Automatic-Dimming Mirror   Q.   "+Automatic_DimmingMirror);
                    System.out.println("Total a pagar :            Q. "+total159);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe               Q. "+Coupe);
                    System.out.println("Cargo Hook          Q.    "+CargoHook);
                    System.out.println("Total a pagar :     Q. "+total160);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe               Q. "+Coupe);
                    System.out.println("Cargo Net           Q.    "+CargoNet);
                    System.out.println("Total a pagar :     Q. "+total161);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe                   Q. "+Coupe);
                    System.out.println("Console Illumination    Q.   "+ConsoleIllumination);
                    System.out.println("Total a pagar :         Q. "+total162);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                Q. "+Coupe);
                    System.out.println("Cargo Organizer      Q.   "+CargoOrganizer);
                    System.out.println("Total a pagar :      Q. "+total163);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                   Q. "+Coupe);
                    System.out.println("Door Panel Protector    Q.   "+DoorPanelProtector);
                    System.out.println("Total a pagar :         Q. "+total164);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                  Q. "+Coupe);
                    System.out.println("Armrest Compartiment   Q.   "+ArmrestCompartiment);
                    System.out.println("Total a pagar :        Q. "+total165);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe                         Q. "+Coupe );
                    System.out.println("Door Sill Trim-Illuminated    Q.   "+DoorSillTrim_Illuminated);
                    System.out.println("Total a pagar :               Q. "+total166);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe              Q. "+Coupe );
                    System.out.println("Cargo Cover        Q.   "+CargoCover);
                    System.out.println("Total a pagar :    Q. "+total167);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Coupe              Q. "+Coupe );
                    System.out.println("Cargo Liner        Q.   "+CargoLiner);
                    System.out.println("Total a pagar :    Q. "+total168);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                    }
                                 break; // SEXTA AMENIDAD
     
                             case 7: // SEPTIMA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Accesorios Eletrónicos");
                    System.out.println("1.-Wireless Phone Charger Q."+WirelllesPhoneCharger);
                    System.out.println("2.-USB Charger - 2.1 Amp. Q."+USBCharger_2Amp);
                    System.out.println("3.-Puddle Light           Q."+PuddleLight);
                    System.out.println("4.-Parking Sensors        Q."+ParkingSensors);
                    System.out.println("Seleccione el Accesorio Electrónico: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                      case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE  ");
                    System.out.println("Coupe                    Q. "+Coupe );
                    System.out.println("Wireless Phone Charger   Q.   "+WirelllesPhoneCharger);
                    System.out.println("Total a pagar :          Q. "+total169);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE  ");
                    System.out.println("Coupe                     Q. "+Coupe );
                    System.out.println("USB Charger - 2.1 Amp.    Q.   "+USBCharger_2Amp);
                    System.out.println("Total a pagar :           Q. "+total170);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe               Q. "+Coupe );
                    System.out.println("Puddle Light        Q.    "+PuddleLight);
                    System.out.println("Total a pagar :     Q. "+total171);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Coupe               Q. "+Coupe );
                    System.out.println("Parking Sensors     Q.   "+ParkingSensors);
                    System.out.println("Total a pagar :     Q. "+total172);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;  
                    }
                                 break; // SEPTIMA AMENIDAD
                    }//FINALIZA PIRMERA AMENIDAD
                    }
                            break;
                            
                            case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println(" USTED SELECCIONO NO AGREGAR NINGUNA AMENIDAD");
                    System.out.println("Gama seleccionada: COUPE           Q. "+Coupe);
                    System.out.println("Amenidades: Ninguna                Q.     "+Ninguno);
                    System.out.println("Total a Pagar:                     Q. "+Coupe);
                    System.out.println("Digite el Numero 2 para Regresar"); 
                    opcion = sn.nextInt();
                            break;    
                    } // PRIMER SWITCH DEL VEHICULO COUPE QUINTO VEHICULO
                            break; // MENU DEL QUINTO VEHICULO
                            
                            case 6: // MENU DEL SEXTO VEHICULO
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("¿Desea agregar amenidades?");
                    System.out.println("1.  SI DESEO AGREGAR AMENIDADES ");
                    System.out.println("2.  NO AGREGAR NINGUNA AMENIDAD ");
                    System.out.println(" Introduzca su Opcion Por Favor\n  1. SI\n  2. NO ");
                    opcion = sn.nextInt(); 
                    
                    switch (opcion){ //PRIMER SWITCH DEL VEHICULO COUPE DEPORTIVO SEXTO VEHICULO
                        case 1:
                            //INICIA LA PRUEBA
                            switch (opcion){ // TERCER SWITCH DEL PRIMERO
                        case 1: // PRIMER CASO DEL TERCER SWITCH AMENIDADES
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println(" Tipos de Amenidades :");
                    System.out.println("01.- Tipo de transmisión");
                    System.out.println("02.- Color de pintura exterior");
                    System.out.println("03.- Color de Tapiceria");
                    System.out.println("04.- Aros");
                    System.out.println("05.- Accesorios exteriores");
                    System.out.println("06.- Accesorios interiores");
                    System.out.println("07.- Accesorios electrónicos");
                    System.out.println("Ingrese el tipo de amenidad Por Favor: ");
                    opcion = sn.nextInt();
                    
                    //SE EMPEZARA CON LAS AMENIDADES
                    switch (opcion){ //INICIA PRIMERA AMENIDAD
                        case 1:  //
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO ");
                    System.out.println("Tipos de Transmisión: ");
                    System.out.println("01.- Manual            Q.  "+Manual);
                    System.out.println("02.- CVT               Q."+CVT);
                    System.out.println("03.- Manual con Turbo  Q.  "+ManualConTurbo);
                    System.out.println("04.- CVT con Turbo     Q."+CVTConTurbo);
                    System.out.println(" Ingrese el tipo de transmisión: ");
                    opcion =sn.nextInt(); 
                    switch (opcion){
                    case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Manual             Q.     "+Manual);
                    System.out.println("Total a pagar :    Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("CVT                Q.   "+CVT);
                    System.out.println("Total a pagar :    Q. "+total173);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Manual con Turbo   Q.     "+ManualConTurbo);
                    System.out.println("Total a pagar :    Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo  Q. "+CoupeDeportivo);
                    System.out.println("CVT con Turbo    Q.   "+CVTConTurbo);
                    System.out.println("Total a pagar :  Q. "+total174);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                            break; // PRIMERA AMENIDAD
                            
                             case 2: //SEGUNDA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO ");
                    System.out.println("Color de pintura Exterior");
                    System.out.println("01.- Cosmic Blue         Q. "+CosmicBlue); 
                    System.out.println("02.- Burgundy Night      Q. "+BurgundyNight);        
                    System.out.println("03.- Rallye Red          Q. "+RallyeRed);
                    System.out.println("04.- Crystal Black       Q. "+CrystalBlack);
                    System.out.println("05.- Modern Steel        Q. "+ModernSteel);
                    System.out.println("06.- TaffetaWhile        Q. "+TaffetaWhile);
                    System.out.println("07.- Energy Green        Q. "+EnergyGreen);
                    System.out.println("08.- Kona Coffee         Q. "+KonaCoffee);
                    System.out.println("09.- Orange Fury         Q. "+OrangeFury);
                    System.out.println("10.- Helios Yellow       Q. "+HeliosYellow);
                    System.out.println("11.- Sonic Gray          Q. "+SonicGray);
                    System.out.println("12.- Polished Metal      Q. "+PolishedMetal);
                    System.out.println(" Ingrese el tipo de color de pintura exterior: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo   Q. "+CoupeDeportivo);
                    System.out.println("Cosmic Blue       Q.     "+CosmicBlue);
                    System.out.println("Total a pagar :   Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo   Q. "+CoupeDeportivo);
                    System.out.println("Burgundy Night    Q.     "+BurgundyNight);
                    System.out.println("Total a pagar :   Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo     Q. "+CoupeDeportivo);
                    System.out.println("Rallye Red          Q.     "+RallyeRed);
                    System.out.println("Total a pagar :     Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo   Q. "+CoupeDeportivo);
                    System.out.println("Crystal Black     Q.     "+CrystalBlack);
                    System.out.println("Total a pagar :   Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo   Q. "+CoupeDeportivo);
                    System.out.println("Modern Steel      Q.     "+ModernSteel);
                    System.out.println("Total a pagar :   Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Taffeta While      Q.     "+TaffetaWhile);
                    System.out.println("Total a pagar :    Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Energy Green       Q.     "+EnergyGreen);
                    System.out.println("Total a pagar :    Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Kona Coffee        Q.     "+KonaCoffee);
                    System.out.println("Total a pagar :    Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Orange Fury        Q.     "+OrangeFury);
                    System.out.println("Total a pagar :    Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Helios Yellow      Q.     "+HeliosYellow);
                    System.out.println("Total a pagar :    Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                              break;
                    
                    case 11:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Sonic Gray         Q.     "+SonicGray);
                    System.out.println("Total a pagar :    Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo  Q. "+CoupeDeportivo);
                    System.out.println("Polished Metal   Q.     "+PolishedMetal);
                    System.out.println("Total a pagar :  Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                    break; //SEGUNDA AMENIDAD
                    
                             case 3: //TERCERA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO ");
                    System.out.println("Color de tapiceria");
                    System.out.println("01.- Gray Cloth                     Q  "+GrayCloth);
                    System.out.println("02.- Black Cloth                    Q. "+BlackCloth);
                    System.out.println("03.- Black/Gray Cloth               Q. "+Black_GrayCloth);
                    System.out.println("04.- Red/Black Suede Effect-Fabric  Q. "+Red_BlackSuedeEffectFabric);
                    System.out.println("Seleccione el color del Vehiculo: ");
                    opcion = sn.nextInt();
                    switch(opcion){
                         case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo   Q. "+CoupeDeportivo);
                    System.out.println("Gray Cloth        Q.     "+GrayCloth);
                    System.out.println("Total a pagar :   Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo  Q. "+CoupeDeportivo);
                    System.out.println("Black Cloth      Q.     "+BlackCloth);
                    System.out.println("Total a pagar :  Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Black/Gray Cloth   Q.     "+Black_GrayCloth);
                    System.out.println("Total a pagar :    Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo                Q. "+CoupeDeportivo);
                    System.out.println("Red/Black Suede Effect-Fabric  Q.     "+Red_BlackSuedeEffectFabric);
                    System.out.println("Total a pagar :                Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                                 break;         //TERCERA AMENIDAD
                                 
                             case 4: //CUARTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO ");
                    System.out.println("Tipos de Aros");
                    System.out.println("1.- Aro de 15 pulgadas  Q.    "+pulgadas_15);
                    System.out.println("2.- Aro de 16 pulgadas  Q.    "+pulgadas_16);
                    System.out.println("3.- Aro de 17 pulgadas  Q. "+pulgadas_17);
                    System.out.println("4.- Aro de 18 pulgadas  Q. "+pulgadas_18);
                    System.out.println("5.- Aro de 19 pulgadas  Q. "+pulgadas_19);
                    System.out.println("Selecciones el tamaño del Aro: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo  Q. "+CoupeDeportivo);
                    System.out.println("15 pulgadas      Q.     "+pulgadas_15);
                    System.out.println("Total a pagar :  Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO ");
                    System.out.println("Coupe Deportivo  Q. "+CoupeDeportivo);
                    System.out.println("16 pulgadas      Q.     "+pulgadas_16);
                    System.out.println("Total a pagar :  Q. "+CoupeDeportivo);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("17 pulgadas        Q.  "+pulgadas_17);
                    System.out.println("Total a pagar :    Q. "+total175);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("18 pulgadas          Q.  "+pulgadas_18);
                    System.out.println("Total a pagar :      Q. "+total176);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("19 pulgadas          Q.  "+pulgadas_19);
                    System.out.println("Total a pagar :      Q. "+total177);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                     }
                                 break; // CUARTA AMENIDAD
                                 
                             case 5: //QUINTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO ");
                    System.out.println("Accesorios Exteriores");
                    System.out.println("1.- Body Side Molding                 Q."+BodySideMolding);
                    System.out.println("2.- Car Cover                         Q."+CarCover);
                    System.out.println("3.- Decklid Spoiler                   Q."+DecklidSpoiler);
                    System.out.println("4.- Door Edge Film                    Q. "+DoorEdgeFilm);
                    System.out.println("5.- Door Edge Guards                  Q. "+DoorEdgeGuards);
                    System.out.println("6.- Door Trim Chrome                  Q."+DoorTrimChrome);
                    System.out.println("7.- Door Visor                        Q."+DoorVisor);
                    System.out.println("8.- Front Fender Emblems              Q. "+FrontFenderEmblems);
                    System.out.println("9.- Rear Bumper Applique              Q. "+RearBumperApplique);
                    System.out.println("10.- Fog Lights                       Q."+FogLights);
                    System.out.println("11.- Nose Mascs                       Q."+NoseMascs);
                    System.out.println("12.- Moonrof Visor                    Q."+MoonrofVisor);
                    System.out.println("13.- Splash Guard Set                 Q."+SplashGuardSet);
                    System.out.println("14.- Dust Cover                       Q."+DustCover);
                    System.out.println("15.- Door Mirror Cover - Carbon Fiber Q."+DoorMirrorCoverCarbonFiber);
                    System.out.println("Seleccione el Accesorio exterior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("Body Side Molding    Q.   "+BodySideMolding);
                    System.out.println("Total a pagar :      Q. "+total178);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("Car Cover            Q.   "+CarCover);
                    System.out.println("Total a pagar :      Q. "+total179);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COUPE DEPORTIVO ");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("Decklid Spoiler      Q.   "+DecklidSpoiler);
                    System.out.println("Total a pagar :      Q. "+total180);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("Door Edge Film       Q.    "+DoorEdgeFilm);
                    System.out.println("Total a pagar :      Q. "+total181);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("Door Edge Guards     Q.    "+DoorEdgeGuards);
                    System.out.println("Total a pagar :      Q. "+total182);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("Door Trim Chrome     Q.   "+DoorTrimChrome);
                    System.out.println("Total a pagar :      Q. "+total183);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("Door Visor           Q.   "+DoorVisor);
                    System.out.println("Total a pagar :      Q. "+total184);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo        Q. "+CoupeDeportivo);
                    System.out.println("Front Fender Emblems   Q.    "+FrontFenderEmblems);
                    System.out.println("Total a pagar :        Q. "+total185);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo        Q. "+CoupeDeportivo);
                    System.out.println("Rear Bumper Applique   Q.    "+RearBumperApplique);
                    System.out.println("Total a pagar :        Q. "+total186);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Fog Lights         Q.   "+FogLights);
                    System.out.println("Total a pagar :    Q. "+total187);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Nose Mascs         Q.   "+NoseMascs);
                    System.out.println("Total a pagar :    Q. "+total188);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Moonrof Visor      Q.   "+MoonrofVisor);
                    System.out.println("Total a pagar :    Q. "+total189);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                        break;
                           
                        case 13:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("Splash Guard Set     Q.   "+SplashGuardSet);
                    System.out.println("Total a pagar :      Q. "+total190);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 14:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Dust Cover         Q.   "+DustCover);
                    System.out.println("Total a pagar :    Q. "+total191);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                            
                        case 15:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo                  Q. "+CoupeDeportivo);
                    System.out.println("Door Mirror Cover-Carbon Fiber   Q.   "+DoorMirrorCoverCarbonFiber);
                    System.out.println("Total a pagar :                  Q. "+total192);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;           
                    }
                                 break;// QUINTA AMENIDAD
                                 
                             case 6: //SEXTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO ");
                    System.out.println("Accesorios Interiores");
                    System.out.println("1.- BAll-Seasons Floor Mats        Q."+All_SeasonFloorMats);
                    System.out.println("2.- Automatic-Dimming Mirror       Q."+Automatic_DimmingMirror);
                    System.out.println("3.- Cargo Hook                     Q. "+CargoHook);
                    System.out.println("4.- Cargo Net                      Q. "+CargoNet);
                    System.out.println("5.- Console Illumination           Q."+ConsoleIllumination);
                    System.out.println("6.- Cargo Organizer                Q. "+CargoOrganizer);
                    System.out.println("7.- Door Panel Protector           Q."+DoorPanelProtector);
                    System.out.println("8.- Armrest Compartiment           Q."+ArmrestCompartiment);
                    System.out.println("9.- RDoor Sill Trim-Illuminated    Q."+DoorSillTrim_Illuminated);
                    System.out.println("10.- Cargo Cover                   Q."+CargoCover);
                    System.out.println("11.- Cargo Liner                   Q."+CargoLiner);
                    System.out.println("Seleccione el Accesorio Interior que desee: ");
                    opcion = sn.nextInt();
                        switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("CoupeDeportivo           Q. "+CoupeDeportivo);
                    System.out.println("All-Seasons Floor Mats   Q.   "+All_SeasonFloorMats);
                    System.out.println("Total a pagar :          Q. "+total193);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo            Q. "+CoupeDeportivo);
                    System.out.println("Automatic-Dimming Mirror   Q.   "+Automatic_DimmingMirror);
                    System.out.println("Total a pagar :            Q. "+total194);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo     Q. "+CoupeDeportivo);
                    System.out.println("Cargo Hook          Q.    "+CargoHook);
                    System.out.println("Total a pagar :     Q. "+total195);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo     Q. "+CoupeDeportivo);
                    System.out.println("Cargo Net           Q.    "+CargoNet);
                    System.out.println("Total a pagar :     Q. "+total196);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo         Q. "+CoupeDeportivo);
                    System.out.println("Console Illumination    Q.   "+ConsoleIllumination);
                    System.out.println("Total a pagar :         Q. "+total197);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo      Q. "+CoupeDeportivo);
                    System.out.println("Cargo Organizer      Q.   "+CargoOrganizer);
                    System.out.println("Total a pagar :      Q. "+total198);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo         Q. "+CoupeDeportivo);
                    System.out.println("Door Panel Protector    Q.   "+DoorPanelProtector);
                    System.out.println("Total a pagar :         Q. "+total199);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo        Q. "+CoupeDeportivo);
                    System.out.println("Armrest Compartiment   Q.   "+ArmrestCompartiment);
                    System.out.println("Total a pagar :        Q. "+total200);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo               Q. "+CoupeDeportivo );
                    System.out.println("Door Sill Trim-Illuminated    Q.   "+DoorSillTrim_Illuminated);
                    System.out.println("Total a pagar :               Q. "+total201);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Cargo Cover        Q.   "+CargoCover);
                    System.out.println("Total a pagar :    Q. "+total202);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo    Q. "+CoupeDeportivo);
                    System.out.println("Cargo Liner        Q.   "+CargoLiner);
                    System.out.println("Total a pagar :    Q. "+total203);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                    }
                                 break; // SEXTA AMENIDAD
     
                             case 7: // SEPTIMA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO ");
                    System.out.println("Accesorios Eletrónicos");
                    System.out.println("1.-Wireless Phone Charger Q."+WirelllesPhoneCharger);
                    System.out.println("2.-USB Charger - 2.1 Amp. Q."+USBCharger_2Amp);
                    System.out.println("3.-Puddle Light           Q."+PuddleLight);
                    System.out.println("4.-Parking Sensors        Q."+ParkingSensors);
                    System.out.println("Seleccione el Accesorio Electrónico: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                      case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO ");
                    System.out.println("Coupe Deportivo          Q. "+CoupeDeportivo );
                    System.out.println("Wireless Phone Charger   Q.   "+WirelllesPhoneCharger);
                    System.out.println("Total a pagar :          Q. "+total204);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO ");
                    System.out.println("Coupe Deportivo          Q. "+CoupeDeportivo );
                    System.out.println("USB Charger - 2.1 Amp.    Q.   "+USBCharger_2Amp);
                    System.out.println("Total a pagar :           Q. "+total205);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo     Q. "+CoupeDeportivo);
                    System.out.println("Puddle Light        Q.    "+PuddleLight);
                    System.out.println("Total a pagar :     Q. "+total206);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO");
                    System.out.println("Coupe Deportivo     Q. "+CoupeDeportivo);
                    System.out.println("Parking Sensors     Q.   "+ParkingSensors);
                    System.out.println("Total a pagar :     Q. "+total207);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;  
                    }
                                 break; // SEPTIMA AMENIDAD
                    }//FINALIZA PIRMERA AMENIDAD
                    }
                            break;
                            
                            case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println(" USTED SELECCIONO NO AGREGAR NINGUNA AMENIDAD");
                    System.out.println("Gama seleccionada: COUPE DEPORTIVO     Q. "+CoupeDeportivo);
                    System.out.println("Amenidades: Ninguna                    Q.     "+Ninguno);
                    System.out.println("Total a Pagar:                         Q. "+CoupeDeportivo);
                    System.out.println("Digite el Numero 2 para Regresar"); 
                    opcion = sn.nextInt();
                            break;     
                    } // PRIMER SWITCH DEL VEHICULO COOUPE DEPORTIVO SEXTO VEHICULO 
                            break; // MENU DEL SEXTO VEHICULO
                            
                            case 7: // MENU DEL SEPTIMO VEHICULO
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("¿Desea agregar amenidades?");
                    System.out.println("1.  SI DESEO AGREGAR AMENIDADES ");
                    System.out.println("2.  NO AGREGAR NINGUNA AMENIDAD ");
                    System.out.println(" Introduzca su Opcion Por Favor\n  1. SI\n  2. NO ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){ //PRIMER SWITCH DEL VEHICULO COMPACTO SEPTIMO VEHICULO
                        case 1:
                            //INICIA LA PRUEBA
                            switch (opcion){ // TERCER SWITCH DEL PRIMERO
                        case 1: // PRIMER CASO DEL TERCER SWITCH AMENIDADES
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println(" Tipos de Amenidades :");
                    System.out.println("01.- Tipo de transmisión");
                    System.out.println("02.- Color de pintura exterior");
                    System.out.println("03.- Color de Tapiceria");
                    System.out.println("04.- Aros");
                    System.out.println("05.- Accesorios exteriores");
                    System.out.println("06.- Accesorios interiores");
                    System.out.println("07.- Accesorios electrónicos");
                    System.out.println("Ingrese el tipo de amenidad Por Favor: ");
                    opcion = sn.nextInt();
                    
                    //SE EMPEZARA CON LAS AMENIDADES
                    switch (opcion){ //INICIA PRIMERA AMENIDAD
                        case 1:  //
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Tipos de Transmisión: ");
                    System.out.println("01.- Manual            Q.  "+Manual);
                    System.out.println("02.- CVT               Q."+CVT);
                    System.out.println("03.- Manual con Turbo  Q.  "+ManualConTurbo);
                    System.out.println("04.- CVT con Turbo     Q."+CVTConTurbo);
                    System.out.println(" Ingrese el tipo de transmisión: ");
                    opcion =sn.nextInt(); 
                    switch (opcion){
                    case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COMPACTO  ");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Manual           Q.     "+Manual);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("CVT              Q.   "+CVT);
                    System.out.println("Total a pagar :  Q. "+total208);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto           Q. "+Compacto);
                    System.out.println("Manual con Turbo   Q.     "+ManualConTurbo);
                    System.out.println("Total a pagar :    Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("CVT con Turbo    Q.   "+CVTConTurbo);
                    System.out.println("Total a pagar :  Q. "+total209);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                            break; // PRIMERA AMENIDAD
                            
                             case 2: //SEGUNDA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Color de pintura Exterior");
                    System.out.println("01.- Cosmic Blue         Q. "+CosmicBlue); 
                    System.out.println("02.- Burgundy Night      Q. "+BurgundyNight);        
                    System.out.println("03.- Rallye Red          Q. "+RallyeRed);
                    System.out.println("04.- Crystal Black       Q. "+CrystalBlack);
                    System.out.println("05.- Modern Steel        Q. "+ModernSteel);
                    System.out.println("06.- TaffetaWhile        Q. "+TaffetaWhile);
                    System.out.println("07.- Energy Green        Q. "+EnergyGreen);
                    System.out.println("08.- Kona Coffee         Q. "+KonaCoffee);
                    System.out.println("09.- Orange Fury         Q. "+OrangeFury);
                    System.out.println("10.- Helios Yellow       Q. "+HeliosYellow);
                    System.out.println("11.- Sonic Gray          Q. "+SonicGray);
                    System.out.println("12.- Polished Metal      Q. "+PolishedMetal);
                    System.out.println(" Ingrese el tipo de color de pintura exterior: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Cosmic Blue      Q.     "+CosmicBlue);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto          Q. "+Compacto);
                    System.out.println("Burgundy Night    Q.     "+BurgundyNight);
                    System.out.println("Total a pagar :   Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto           Q. "+Compacto);
                    System.out.println("Rallye Red         Q.     "+RallyeRed);
                    System.out.println("Total a pagar :    Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Crystal Black    Q.     "+CrystalBlack);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Modern Steel     Q.     "+ModernSteel);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Taffeta While    Q.     "+TaffetaWhile);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Energy Green     Q.     "+EnergyGreen);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Kona Coffee      Q.     "+KonaCoffee);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Orange Fury      Q.     "+OrangeFury);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Helios Yellow    Q.     "+HeliosYellow);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                              break;
                    
                    case 11:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Sonic Gray       Q.     "+SonicGray);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Polished Metal   Q.     "+PolishedMetal);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                    break; //SEGUNDA AMENIDAD
                    
                             case 3: //TERCERA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Color de tapiceria");
                    System.out.println("01.- Gray Cloth                     Q  "+GrayCloth);
                    System.out.println("02.- Black Cloth                    Q. "+BlackCloth);
                    System.out.println("03.- Black/Gray Cloth               Q. "+Black_GrayCloth);
                    System.out.println("04.- Red/Black Suede Effect-Fabric  Q. "+Red_BlackSuedeEffectFabric);
                    System.out.println("Seleccione el color del Vehiculo: ");
                    opcion = sn.nextInt();
                    switch(opcion){
                         case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Gray Cloth       Q.     "+GrayCloth);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto         Q. "+Compacto);
                    System.out.println("Black Cloth      Q.     "+BlackCloth);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto           Q. "+Compacto);
                    System.out.println("Black/Gray Cloth   Q.     "+Black_GrayCloth);
                    System.out.println("Total a pagar :    Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto                       Q. "+Compacto);
                    System.out.println("Red/Black Suede Effect-Fabric  Q.     "+Red_BlackSuedeEffectFabric);
                    System.out.println("Total a pagar :                Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }

                                 break;         //TERCERA AMENIDAD
                                 
                             case 4: //CUARTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Tipos de Aros");
                    System.out.println("1.- Aro de 15 pulgadas  Q.    "+pulgadas_15);
                    System.out.println("2.- Aro de 16 pulgadas  Q.    "+pulgadas_16);
                    System.out.println("3.- Aro de 17 pulgadas  Q. "+pulgadas_17);
                    System.out.println("4.- Aro de 18 pulgadas  Q. "+pulgadas_18);
                    System.out.println("5.- Aro de 19 pulgadas  Q. "+pulgadas_19);
                    System.out.println("Selecciones el tamaño del Aro: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto         Q. "+Compacto );
                    System.out.println("15 pulgadas      Q.     "+pulgadas_15);
                    System.out.println("Total a pagar :  Q. "+Coupe );
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto         Q. "+Compacto );
                    System.out.println("16 pulgadas      Q.     "+pulgadas_16);
                    System.out.println("Total a pagar :  Q. "+Compacto);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto          Q. "+Compacto);
                    System.out.println("17 pulgadas        Q.  "+pulgadas_17);
                    System.out.println("Total a pagar :    Q. "+total210);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto             Q. "+Compacto );
                    System.out.println("18 pulgadas          Q.  "+pulgadas_18);
                    System.out.println("Total a pagar :      Q. "+total211);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto             Q. "+Compacto );
                    System.out.println("19 pulgadas          Q.  "+pulgadas_19);
                    System.out.println("Total a pagar :      Q. "+total212);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                     }
                                 break; // CUARTA AMENIDAD
                                 
                             case 5: //QUINTA AMENIDAD
                                  System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Accesorios Exteriores");
                    System.out.println("1.- Body Side Molding                 Q."+BodySideMolding);
                    System.out.println("2.- Car Cover                         Q."+CarCover);
                    System.out.println("3.- Decklid Spoiler                   Q."+DecklidSpoiler);
                    System.out.println("4.- Door Edge Film                    Q. "+DoorEdgeFilm);
                    System.out.println("5.- Door Edge Guards                  Q. "+DoorEdgeGuards);
                    System.out.println("6.- Door Trim Chrome                  Q."+DoorTrimChrome);
                    System.out.println("7.- Door Visor                        Q."+DoorVisor);
                    System.out.println("8.- Front Fender Emblems              Q. "+FrontFenderEmblems);
                    System.out.println("9.- Rear Bumper Applique              Q. "+RearBumperApplique);
                    System.out.println("10.- Fog Lights                       Q."+FogLights);
                    System.out.println("11.- Nose Mascs                       Q."+NoseMascs);
                    System.out.println("12.- Moonrof Visor                    Q."+MoonrofVisor);
                    System.out.println("13.- Splash Guard Set                 Q."+SplashGuardSet);
                    System.out.println("14.- Dust Cover                       Q."+DustCover);
                    System.out.println("15.- Door Mirror Cover - Carbon Fiber Q."+DoorMirrorCoverCarbonFiber);
                    System.out.println("Seleccione el Accesorio exterior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto             Q. "+Compacto);
                    System.out.println("Body Side Molding    Q.   "+BodySideMolding);
                    System.out.println("Total a pagar :      Q. "+total213);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COUPE ");
                    System.out.println("Compacto             Q. "+Compacto);
                    System.out.println("Car Cover            Q.   "+CarCover);
                    System.out.println("Total a pagar :      Q. "+total214);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COMPACTO ");
                    System.out.println("Compacto             Q. "+Compacto);
                    System.out.println("Decklid Spoiler      Q.   "+DecklidSpoiler);
                    System.out.println("Total a pagar :      Q. "+total215);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto             Q. "+Coupe);
                    System.out.println("Door Edge Film       Q.    "+DoorEdgeFilm);
                    System.out.println("Total a pagar :      Q. "+total216);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto             Q. "+Compacto);
                    System.out.println("Door Edge Guards     Q.    "+DoorEdgeGuards);
                    System.out.println("Total a pagar :      Q. "+total217);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto             Q. "+Compacto);
                    System.out.println("Door Trim Chrome     Q.   "+DoorTrimChrome);
                    System.out.println("Total a pagar :      Q. "+total218);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto             Q. "+Compacto);
                    System.out.println("Door Visor           Q.   "+DoorVisor);
                    System.out.println("Total a pagar :      Q. "+total219);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto               Q. "+Compacto);
                    System.out.println("Front Fender Emblems   Q.    "+FrontFenderEmblems);
                    System.out.println("Total a pagar :        Q. "+total220);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:COMPACTO ");
                    System.out.println("Compacto                Q. "+Coupe);
                    System.out.println("Rear Bumper Applique   Q.    "+RearBumperApplique);
                    System.out.println("Total a pagar :        Q. "+total221);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto           Q. "+Compacto);
                    System.out.println("Fog Lights         Q.   "+FogLights);
                    System.out.println("Total a pagar :    Q. "+total222);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto           Q. "+Compacto);
                    System.out.println("Nose Mascs         Q.   "+NoseMascs);
                    System.out.println("Total a pagar :    Q. "+total223);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto           Q. "+Compacto);
                    System.out.println("Moonrof Visor      Q.   "+MoonrofVisor);
                    System.out.println("Total a pagar :    Q. "+total224);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                        break;
                           
                        case 13:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto             Q. "+Compacto);
                    System.out.println("Splash Guard Set     Q.   "+SplashGuardSet);
                    System.out.println("Total a pagar :      Q. "+total225);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 14:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto          Q. "+Compacto);
                    System.out.println("Dust Cover         Q.   "+DustCover);
                    System.out.println("Total a pagar :    Q. "+total226);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                            
                        case 15:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto                         Q. "+Compacto);
                    System.out.println("Door Mirror Cover-Carbon Fiber   Q.   "+DoorMirrorCoverCarbonFiber);
                    System.out.println("Total a pagar :                  Q. "+total227);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;           
                    }
                                 break;// QUINTA AMENIDAD
                                 
                             case 6: //SEXTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Accesorios Interiores");
                    System.out.println("1.- BAll-Seasons Floor Mats        Q."+All_SeasonFloorMats);
                    System.out.println("2.- Automatic-Dimming Mirror       Q."+Automatic_DimmingMirror);
                    System.out.println("3.- Cargo Hook                     Q. "+CargoHook);
                    System.out.println("4.- Cargo Net                      Q. "+CargoNet);
                    System.out.println("5.- Console Illumination           Q."+ConsoleIllumination);
                    System.out.println("6.- Cargo Organizer                Q. "+CargoOrganizer);
                    System.out.println("7.- Door Panel Protector           Q."+DoorPanelProtector);
                    System.out.println("8.- Armrest Compartiment           Q."+ArmrestCompartiment);
                    System.out.println("9.- RDoor Sill Trim-Illuminated    Q."+DoorSillTrim_Illuminated);
                    System.out.println("10.- Cargo Cover                   Q."+CargoCover);
                    System.out.println("11.- Cargo Liner                   Q."+CargoLiner);
                    System.out.println("Seleccione el Accesorio Interior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto                 Q. "+Compacto);
                    System.out.println("All-Seasons Floor Mats   Q.   "+All_SeasonFloorMats);
                    System.out.println("Total a pagar :          Q. "+total228);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto                   Q. "+Compacto);
                    System.out.println("Automatic-Dimming Mirror   Q.   "+Automatic_DimmingMirror);
                    System.out.println("Total a pagar :            Q. "+total229);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto            Q. "+Compacto);
                    System.out.println("Cargo Hook          Q.    "+CargoHook);
                    System.out.println("Total a pagar :     Q. "+total230);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto            Q. "+Compacto);
                    System.out.println("Cargo Net           Q.    "+CargoNet);
                    System.out.println("Total a pagar :     Q. "+total231);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto                Q. "+Compacto);
                    System.out.println("Console Illumination    Q.   "+ConsoleIllumination);
                    System.out.println("Total a pagar :         Q. "+total232);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto             Q. "+Compacto);
                    System.out.println("Cargo Organizer      Q.   "+CargoOrganizer);
                    System.out.println("Total a pagar :      Q. "+total233);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto                Q. "+Compacto);
                    System.out.println("Door Panel Protector    Q.   "+DoorPanelProtector);
                    System.out.println("Total a pagar :         Q. "+total234);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto               Q. "+Compacto);
                    System.out.println("Armrest Compartiment   Q.   "+ArmrestCompartiment);
                    System.out.println("Total a pagar :        Q. "+total235);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto                      Q. "+Compacto );
                    System.out.println("Door Sill Trim-Illuminated    Q.   "+DoorSillTrim_Illuminated);
                    System.out.println("Total a pagar :               Q. "+total236);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto           Q. "+Compacto );
                    System.out.println("Cargo Cover        Q.   "+CargoCover);
                    System.out.println("Total a pagar :    Q. "+total237);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO");
                    System.out.println("Compacto           Q. "+Compacto );
                    System.out.println("Cargo Liner        Q.   "+CargoLiner);
                    System.out.println("Total a pagar :    Q. "+total238);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                    }
                                 break; // SEXTA AMENIDAD
     
                             case 7: // SEPTIMA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Accesorios Eletrónicos");
                    System.out.println("1.-Wireless Phone Charger Q."+WirelllesPhoneCharger);
                    System.out.println("2.-USB Charger - 2.1 Amp. Q."+USBCharger_2Amp);
                    System.out.println("3.-Puddle Light           Q."+PuddleLight);
                    System.out.println("4.-Parking Sensors        Q."+ParkingSensors);
                    System.out.println("Seleccione el Accesorio Electrónico: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                      case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO  ");
                    System.out.println("Compacto                 Q. "+Compacto );
                    System.out.println("Wireless Phone Charger   Q.   "+WirelllesPhoneCharger);
                    System.out.println("Total a pagar :          Q. "+total239);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO  ");
                    System.out.println("Compacto                  Q. "+Compacto );
                    System.out.println("USB Charger - 2.1 Amp.    Q.   "+USBCharger_2Amp);
                    System.out.println("Total a pagar :           Q. "+total240);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto            Q. "+Compacto );
                    System.out.println("Puddle Light        Q.    "+PuddleLight);
                    System.out.println("Total a pagar :     Q. "+total241);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COMPACTO ");
                    System.out.println("Compacto            Q. "+Compacto );
                    System.out.println("Parking Sensors     Q.   "+ParkingSensors);
                    System.out.println("Total a pagar :     Q. "+total242);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;  
                    }
                                 break; // SEPTIMA AMENIDAD
                    }//FINALIZA PIRMERA AMENIDAD
                    }
                            break;
                               
                            case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println(" USTED SELECCIONO NO AGREGAR NINGUNA AMENIDAD");
                    System.out.println("Gama seleccionada: COMPACTO        Q. "+Compacto);
                    System.out.println("Amenidades: Ninguna                Q.     "+Ninguno);
                    System.out.println("Total a Pagar:                     Q. "+Compacto);
                    System.out.println("Digite el Numero 2 para Regresar"); 
                    opcion = sn.nextInt();
                            break;      
                    } // PRIMER SWITCH DEL VEHICULO COMPACTO SEPTIMO VEHICULO
                            break; // MENU DEL SEPTIMO VEHICULO
                            
                            case 8: // MENU DEL OCTAVO VEHICULO
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("¿Desea agregar amenidades?");
                    System.out.println("1.  SI DESEO AGREGAR AMENIDADES ");
                    System.out.println("2.  NO AGREGAR NINGUNA AMENIDAD ");
                    System.out.println(" Introduzca su Opcion Por Favor\n  1. SI\n  2. NO ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){ //PRIMER SWITCH DEL VEHICULO HATCHBACK OCTAVO VEHICULO
                        case 1:
                            //INICIA LA PRUEBA
                            switch (opcion){ // TERCER SWITCH DEL PRIMERO
                        case 1: // PRIMER CASO DEL TERCER SWITCH AMENIDADES
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println(" Tipos de Amenidades :");
                    System.out.println("01.- Tipo de transmisión");
                    System.out.println("02.- Color de pintura exterior");
                    System.out.println("03.- Color de Tapiceria");
                    System.out.println("04.- Aros");
                    System.out.println("05.- Accesorios exteriores");
                    System.out.println("06.- Accesorios interiores");
                    System.out.println("07.- Accesorios electrónicos");
                    System.out.println("Ingrese el tipo de amenidad Por Favor: ");
                    opcion = sn.nextInt();
                    
                    //SE EMPEZARA CON LAS AMENIDADES
                    switch (opcion){ //INICIA PRIMERA AMENIDAD
                        case 1:  //
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Tipos de Transmisión: ");
                    System.out.println("01.- Manual            Q.  "+Manual);
                    System.out.println("02.- CVT               Q."+CVT);
                    System.out.println("03.- Manual con Turbo  Q.  "+ManualConTurbo);
                    System.out.println("04.- CVT con Turbo     Q."+CVTConTurbo);
                    System.out.println(" Ingrese el tipo de transmisión: ");
                    opcion =sn.nextInt(); 
                    switch (opcion){
                    case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:HATCHBACK  ");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Manual           Q.     "+Manual);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("CVT              Q.   "+CVT);
                    System.out.println("Total a pagar :  Q. "+total243);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("CHatchback         Q. "+Hatchback);
                    System.out.println("Manual con Turbo   Q.     "+ManualConTurbo);
                    System.out.println("Total a pagar :    Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("CVT con Turbo    Q.   "+CVTConTurbo);
                    System.out.println("Total a pagar :  Q. "+total244);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                            break; // PRIMERA AMENIDAD
                            
                             case 2: //SEGUNDA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Color de pintura Exterior");
                    System.out.println("01.- Cosmic Blue         Q. "+CosmicBlue); 
                    System.out.println("02.- Burgundy Night      Q. "+BurgundyNight);        
                    System.out.println("03.- Rallye Red          Q. "+RallyeRed);
                    System.out.println("04.- Crystal Black       Q. "+CrystalBlack);
                    System.out.println("05.- Modern Steel        Q. "+ModernSteel);
                    System.out.println("06.- TaffetaWhile        Q. "+TaffetaWhile);
                    System.out.println("07.- Energy Green        Q. "+EnergyGreen);
                    System.out.println("08.- Kona Coffee         Q. "+KonaCoffee);
                    System.out.println("09.- Orange Fury         Q. "+OrangeFury);
                    System.out.println("10.- Helios Yellow       Q. "+HeliosYellow);
                    System.out.println("11.- Sonic Gray          Q. "+SonicGray);
                    System.out.println("12.- Polished Metal      Q. "+PolishedMetal);
                    System.out.println(" Ingrese el tipo de color de pintura exterior: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Cosmic Blue      Q.     "+CosmicBlue);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback         Q. "+Hatchback);
                    System.out.println("Burgundy Night    Q.     "+BurgundyNight);
                    System.out.println("Total a pagar :   Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback          Q. "+Hatchback);
                    System.out.println("Rallye Red         Q.     "+RallyeRed);
                    System.out.println("Total a pagar :    Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Crystal Black    Q.     "+CrystalBlack);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Modern Steel     Q.     "+ModernSteel);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Taffeta While    Q.     "+TaffetaWhile);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Energy Green     Q.     "+EnergyGreen);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Kona Coffee      Q.     "+KonaCoffee);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Orange Fury      Q.     "+OrangeFury);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Helios Yellow    Q.     "+HeliosYellow);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                              break;
                    
                    case 11:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Sonic Gray       Q.     "+SonicGray);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Polished Metal   Q.     "+PolishedMetal);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                    break; //SEGUNDA AMENIDAD
                    
                             case 3: //TERCERA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Color de tapiceria");
                    System.out.println("01.- Gray Cloth                     Q  "+GrayCloth);
                    System.out.println("02.- Black Cloth                    Q. "+BlackCloth);
                    System.out.println("03.- Black/Gray Cloth               Q. "+Black_GrayCloth);
                    System.out.println("04.- Red/Black Suede Effect-Fabric  Q. "+Red_BlackSuedeEffectFabric);
                    System.out.println("Seleccione el color del Vehiculo: ");
                    opcion = sn.nextInt();
                    switch(opcion){
                         case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Gray Cloth       Q.     "+GrayCloth);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback        Q. "+Hatchback);
                    System.out.println("Black Cloth      Q.     "+BlackCloth);
                    System.out.println("Total a pagar :  Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback          Q. "+Hatchback);
                    System.out.println("Black/Gray Cloth   Q.     "+Black_GrayCloth);
                    System.out.println("Total a pagar :    Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback                      Q. "+Hatchback);
                    System.out.println("Red/Black Suede Effect-Fabric  Q.     "+Red_BlackSuedeEffectFabric);
                    System.out.println("Total a pagar :                Q. "+Hatchback);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                                 break;         //TERCERA AMENIDAD            
                             case 4: //CUARTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Tipos de Aros");
                    System.out.println("1.- Aro de 15 pulgadas  Q.    "+pulgadas_15);
                    System.out.println("2.- Aro de 16 pulgadas  Q.    "+pulgadas_16);
                    System.out.println("3.- Aro de 17 pulgadas  Q. "+pulgadas_17);
                    System.out.println("4.- Aro de 18 pulgadas  Q. "+pulgadas_18);
                    System.out.println("5.- Aro de 19 pulgadas  Q. "+pulgadas_19);
                    System.out.println("Selecciones el tamaño del Aro: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback        Q. "+Hatchback );
                    System.out.println("15 pulgadas      Q.     "+pulgadas_15);
                    System.out.println("Total a pagar :  Q. "+Hatchback );
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback        Q. "+Hatchback );
                    System.out.println("16 pulgadas      Q.     "+pulgadas_16);
                    System.out.println("Total a pagar :  Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback          Q. "+Hatchback);
                    System.out.println("17 pulgadas        Q.  "+pulgadas_17);
                    System.out.println("Total a pagar :    Q. "+total245);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback            Q. "+Hatchback );
                    System.out.println("18 pulgadas          Q.  "+pulgadas_18);
                    System.out.println("Total a pagar :      Q. "+total246);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback            Q. "+Hatchback );
                    System.out.println("19 pulgadas          Q.  "+pulgadas_19);
                    System.out.println("Total a pagar :      Q. "+total247);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                     }
                                 break; // CUARTA AMENIDAD
                                 
                             case 5: //QUINTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Accesorios Exteriores");
                    System.out.println("1.- Body Side Molding                 Q."+BodySideMolding);
                    System.out.println("2.- Car Cover                         Q."+CarCover);
                    System.out.println("3.- Decklid Spoiler                   Q."+DecklidSpoiler);
                    System.out.println("4.- Door Edge Film                    Q. "+DoorEdgeFilm);
                    System.out.println("5.- Door Edge Guards                  Q. "+DoorEdgeGuards);
                    System.out.println("6.- Door Trim Chrome                  Q."+DoorTrimChrome);
                    System.out.println("7.- Door Visor                        Q."+DoorVisor);
                    System.out.println("8.- Front Fender Emblems              Q. "+FrontFenderEmblems);
                    System.out.println("9.- Rear Bumper Applique              Q. "+RearBumperApplique);
                    System.out.println("10.- Fog Lights                       Q."+FogLights);
                    System.out.println("11.- Nose Mascs                       Q."+NoseMascs);
                    System.out.println("12.- Moonrof Visor                    Q."+MoonrofVisor);
                    System.out.println("13.- Splash Guard Set                 Q."+SplashGuardSet);
                    System.out.println("14.- Dust Cover                       Q."+DustCover);
                    System.out.println("15.- Door Mirror Cover - Carbon Fiber Q."+DoorMirrorCoverCarbonFiber);
                    System.out.println("Seleccione el Accesorio exterior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback            Q. "+Hatchback);
                    System.out.println("Body Side Molding    Q.   "+BodySideMolding);
                    System.out.println("Total a pagar :      Q. "+total248);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:HATCHBACK ");
                    System.out.println("CHatchback           Q. "+Hatchback);
                    System.out.println("Car Cover            Q.   "+CarCover);
                    System.out.println("Total a pagar :      Q. "+total249);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:HATCHBACK ");
                    System.out.println("Hatchback            Q. "+Hatchback);
                    System.out.println("Decklid Spoiler      Q.   "+DecklidSpoiler);
                    System.out.println("Total a pagar :      Q. "+total250);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback            Q. "+Hatchback);
                    System.out.println("Door Edge Film       Q.    "+DoorEdgeFilm);
                    System.out.println("Total a pagar :      Q. "+total251);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback            Q. "+Hatchback);
                    System.out.println("Door Edge Guards     Q.    "+DoorEdgeGuards);
                    System.out.println("Total a pagar :      Q. "+total252);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback            Q. "+Hatchback);
                    System.out.println("Door Trim Chrome     Q.   "+DoorTrimChrome);
                    System.out.println("Total a pagar :      Q. "+total253);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback            Q. "+Hatchback);
                    System.out.println("Door Visor           Q.   "+DoorVisor);
                    System.out.println("Total a pagar :      Q. "+total254);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback              Q. "+Hatchback);
                    System.out.println("Front Fender Emblems   Q.    "+FrontFenderEmblems);
                    System.out.println("Total a pagar :        Q. "+total255);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:HATCHBACK ");
                    System.out.println("Hatchback              Q. "+Hatchback);
                    System.out.println("Rear Bumper Applique   Q.    "+RearBumperApplique);
                    System.out.println("Total a pagar :        Q. "+total256);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback          Q. "+Hatchback);
                    System.out.println("Fog Lights         Q.   "+FogLights);
                    System.out.println("Total a pagar :    Q. "+total257);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback          Q. "+Hatchback);
                    System.out.println("Nose Mascs         Q.   "+NoseMascs);
                    System.out.println("Total a pagar :    Q. "+total258);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback          Q. "+Hatchback);
                    System.out.println("Moonrof Visor      Q.   "+MoonrofVisor);
                    System.out.println("Total a pagar :    Q. "+total259);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                        break;
                           
                        case 13:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback            Q. "+Hatchback);
                    System.out.println("Splash Guard Set     Q.   "+SplashGuardSet);
                    System.out.println("Total a pagar :      Q. "+total260);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 14:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback          Q. "+Hatchback);
                    System.out.println("Dust Cover         Q.   "+DustCover);
                    System.out.println("Total a pagar :    Q. "+total261);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                            
                        case 15:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback                        Q. "+Hatchback);
                    System.out.println("Door Mirror Cover-Carbon Fiber   Q.   "+DoorMirrorCoverCarbonFiber);
                    System.out.println("Total a pagar :                  Q. "+total262);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;           
                    }
                                 break;// QUINTA AMENIDAD
                                 
                             case 6: //SEXTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Accesorios Interiores");
                    System.out.println("1.- BAll-Seasons Floor Mats        Q."+All_SeasonFloorMats);
                    System.out.println("2.- Automatic-Dimming Mirror       Q."+Automatic_DimmingMirror);
                    System.out.println("3.- Cargo Hook                     Q. "+CargoHook);
                    System.out.println("4.- Cargo Net                      Q. "+CargoNet);
                    System.out.println("5.- Console Illumination           Q."+ConsoleIllumination);
                    System.out.println("6.- Cargo Organizer                Q. "+CargoOrganizer);
                    System.out.println("7.- Door Panel Protector           Q."+DoorPanelProtector);
                    System.out.println("8.- Armrest Compartiment           Q."+ArmrestCompartiment);
                    System.out.println("9.- RDoor Sill Trim-Illuminated    Q."+DoorSillTrim_Illuminated);
                    System.out.println("10.- Cargo Cover                   Q."+CargoCover);
                    System.out.println("11.- Cargo Liner                   Q."+CargoLiner);
                    System.out.println("Seleccione el Accesorio Interior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback                Q. "+Hatchback);
                    System.out.println("All-Seasons Floor Mats   Q.   "+All_SeasonFloorMats);
                    System.out.println("Total a pagar :          Q. "+total263);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback                  Q. "+Hatchback);
                    System.out.println("Automatic-Dimming Mirror   Q.   "+Automatic_DimmingMirror);
                    System.out.println("Total a pagar :            Q. "+total264);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback           Q. "+Hatchback);
                    System.out.println("Cargo Hook          Q.    "+CargoHook);
                    System.out.println("Total a pagar :     Q. "+total265);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback           Q. "+Hatchback);
                    System.out.println("Cargo Net           Q.    "+CargoNet);
                    System.out.println("Total a pagar :     Q. "+total266);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback               Q. "+Hatchback);
                    System.out.println("Console Illumination    Q.   "+ConsoleIllumination);
                    System.out.println("Total a pagar :         Q. "+total267);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback            Q. "+Hatchback);
                    System.out.println("Cargo Organizer      Q.   "+CargoOrganizer);
                    System.out.println("Total a pagar :      Q. "+total268);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback               Q. "+Hatchback);
                    System.out.println("Door Panel Protector    Q.   "+DoorPanelProtector);
                    System.out.println("Total a pagar :         Q. "+total269);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback              Q. "+Hatchback);
                    System.out.println("Armrest Compartiment   Q.   "+ArmrestCompartiment);
                    System.out.println("Total a pagar :        Q. "+total270);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback                     Q. "+Hatchback );
                    System.out.println("Door Sill Trim-Illuminated    Q.   "+DoorSillTrim_Illuminated);
                    System.out.println("Total a pagar :               Q. "+total271);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback          Q. "+Hatchback );
                    System.out.println("Cargo Cover        Q.   "+CargoCover);
                    System.out.println("Total a pagar :    Q. "+total272);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK");
                    System.out.println("Hatchback          Q. "+Hatchback );
                    System.out.println("Cargo Liner        Q.   "+CargoLiner);
                    System.out.println("Total a pagar :    Q. "+total273);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                    }
                                 break; // SEXTA AMENIDAD
     
                             case 7: // SEPTIMA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Accesorios Eletrónicos");
                    System.out.println("1.-Wireless Phone Charger Q."+WirelllesPhoneCharger);
                    System.out.println("2.-USB Charger - 2.1 Amp. Q."+USBCharger_2Amp);
                    System.out.println("3.-Puddle Light           Q."+PuddleLight);
                    System.out.println("4.-Parking Sensors        Q."+ParkingSensors);
                    System.out.println("Seleccione el Accesorio Electrónico: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                      case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK  ");
                    System.out.println("Hatchback                Q. "+Hibrido );
                    System.out.println("Wireless Phone Charger   Q.   "+WirelllesPhoneCharger);
                    System.out.println("Total a pagar :          Q. "+total274);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK  ");
                    System.out.println("Hatchback                 Q. "+Hatchback );
                    System.out.println("USB Charger - 2.1 Amp.    Q.   "+USBCharger_2Amp);
                    System.out.println("Total a pagar :           Q. "+total275);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback           Q. "+Hatchback );
                    System.out.println("Puddle Light        Q.    "+PuddleLight);
                    System.out.println("Total a pagar :     Q. "+total276);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: HATCHBACK ");
                    System.out.println("Hatchback           Q. "+Hatchback );
                    System.out.println("Parking Sensors     Q.   "+ParkingSensors);
                    System.out.println("Total a pagar :     Q. "+total277);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;  
                    }
                                 break; // SEPTIMA AMENIDAD
                    }//FINALIZA PIRMERA AMENIDAD
                    }
                            break;
                            
                            case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println(" USTED SELECCIONO NO AGREGAR NINGUNA AMENIDAD");
                    System.out.println("Gama seleccionada: HATCHBACK       Q. "+Hatchback);
                    System.out.println("Amenidades: Ninguna                Q.     "+Ninguno);
                    System.out.println("Total a Pagar:                     Q. "+Hatchback);
                    System.out.println("Digite el Numero 2 para Regresar"); 
                    opcion = sn.nextInt();
                            break;
                    } // PRIMER SWITCH DEL VEHICULO HATCHBACK OCTAVO VEHICULO
                            break; //MENU DEL OCTAVO VEHICULO
                            
                            case 9: // MENU DEL NOVENO VEHICULO
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("¿Desea agregar amenidades?");
                    System.out.println("1.  SI DESEO AGREGAR AMENIDADES ");
                    System.out.println("2.  NO AGREGAR NINGUNA AMENIDAD ");
                    System.out.println(" Introduzca su Opcion Por Favor\n  1. SI\n  2. NO ");
                    opcion = sn.nextInt();
                    
                    switch (opcion){ //PRIMER SWITCH DEL VEHICULO ECONOMICO VERSION RALLY NOVENO VEHICULO
                        case 1:
                            //INICIA LA PRUEBA
                            switch (opcion){ // TERCER SWITCH DEL PRIMERO
                        case 1: // PRIMER CASO DEL TERCER SWITCH AMENIDADES
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println(" Tipos de Amenidades :");
                    System.out.println("01.- Tipo de transmisión");
                    System.out.println("02.- Color de pintura exterior");
                    System.out.println("03.- Color de Tapiceria");
                    System.out.println("04.- Aros");
                    System.out.println("05.- Accesorios exteriores");
                    System.out.println("06.- Accesorios interiores");
                    System.out.println("07.- Accesorios electrónicos");
                    System.out.println("Ingrese el tipo de amenidad Por Favor: ");
                    opcion = sn.nextInt();
                    
                    //SE EMPEZARA CON LAS AMENIDADES
                    switch (opcion){ //INICIA PRIMERA AMENIDAD
                        case 1:  //
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Tipos de Transmisión: ");
                    System.out.println("01.- Manual            Q.  "+Manual);
                    System.out.println("02.- CVT               Q."+CVT);
                    System.out.println("03.- Manual con Turbo  Q.  "+ManualConTurbo);
                    System.out.println("04.- CVT con Turbo     Q."+CVTConTurbo);
                    System.out.println(" Ingrese el tipo de transmisión: ");
                    opcion =sn.nextInt(); 
                    switch (opcion){
                    case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:ECONÓMICO VERSIÓN RALLY  ");
                    System.out.println("Economico Version Rally         Q. "+EconomicoVersionRally);
                    System.out.println("Manual                          Q.     "+Manual);
                    System.out.println("Total a pagar :                 Q. "+Coupe);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally           Q. "+EconomicoVersionRally);
                    System.out.println("CVT                               Q.   "+CVT);
                    System.out.println("Total a pagar :                   Q. "+total278);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally           Q. "+EconomicoVersionRally);
                    System.out.println("Manual con Turbo                  Q.     "+ManualConTurbo);
                    System.out.println("Total a pagar :                   Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally         Q. "+EconomicoVersionRally);
                    System.out.println("CVT con Turbo                   Q.   "+CVTConTurbo);
                    System.out.println("Total a pagar :                  Q. "+total279);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                            break; // PRIMERA AMENIDAD
                            
                             case 2: //SEGUNDA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Color de pintura Exterior");
                    System.out.println("01.- Cosmic Blue         Q. "+CosmicBlue); 
                    System.out.println("02.- Burgundy Night      Q. "+BurgundyNight);        
                    System.out.println("03.- Rallye Red          Q. "+RallyeRed);
                    System.out.println("04.- Crystal Black       Q. "+CrystalBlack);
                    System.out.println("05.- Modern Steel        Q. "+ModernSteel);
                    System.out.println("06.- TaffetaWhile        Q. "+TaffetaWhile);
                    System.out.println("07.- Energy Green        Q. "+EnergyGreen);
                    System.out.println("08.- Kona Coffee         Q. "+KonaCoffee);
                    System.out.println("09.- Orange Fury         Q. "+OrangeFury);
                    System.out.println("10.- Helios Yellow       Q. "+HeliosYellow);
                    System.out.println("11.- Sonic Gray          Q. "+SonicGray);
                    System.out.println("12.- Polished Metal      Q. "+PolishedMetal);
                    System.out.println(" Ingrese el tipo de color de pintura exterior: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("EconomicoVersionRally     Q. "+EconomicoVersionRally);
                    System.out.println("Cosmic Blue               Q.     "+CosmicBlue);
                    System.out.println("Total a pagar :           Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally       Q. "+EconomicoVersionRally);
                    System.out.println("Burgundy Night                Q.     "+BurgundyNight);
                    System.out.println("Total a pagar :               Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally       Q. "+EconomicoVersionRally);
                    System.out.println("Rallye Red                    Q.     "+RallyeRed);
                    System.out.println("Total a pagar :               Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("EconomicoVersionRally    Q. "+EconomicoVersionRally);
                    System.out.println("Crystal Black            Q.     "+CrystalBlack);
                    System.out.println("Total a pagar :          Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally     Q. "+EconomicoVersionRally);
                    System.out.println("Modern Steel                Q.     "+ModernSteel);
                    System.out.println("Total a pagar :             Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally       Q. "+EconomicoVersionRally);
                    System.out.println("Taffeta While                 Q.     "+TaffetaWhile);
                    System.out.println("Total a pagar :               Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally         Q. "+EconomicoVersionRally);
                    System.out.println("Energy Green                    Q.     "+EnergyGreen);
                    System.out.println("Total a pagar :                 Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally        Q. "+EconomicoVersionRally);
                    System.out.println("Kona Coffee                    Q.     "+KonaCoffee);
                    System.out.println("Total a pagar :                Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally      Q. "+EconomicoVersionRally);
                    System.out.println("Orange Fury                  Q.     "+OrangeFury);
                    System.out.println("Total a pagar :              Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally       Q. "+EconomicoVersionRally);
                    System.out.println("Helios Yellow                 Q.     "+HeliosYellow);
                    System.out.println("Total a pagar :               Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                              break;
                    
                    case 11:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally         Q. "+EconomicoVersionRally);
                    System.out.println("Sonic Gray                      Q.     "+SonicGray);
                    System.out.println("Total a pagar :                 Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally       Q. "+EconomicoVersionRally);
                    System.out.println("Polished Metal                Q.     "+PolishedMetal);
                    System.out.println("Total a pagar :               Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                    }
                    break; //SEGUNDA AMENIDAD
                    
                             case 3: //TERCERA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Color de tapiceria");
                    System.out.println("01.- Gray Cloth                     Q  "+GrayCloth);
                    System.out.println("02.- Black Cloth                    Q. "+BlackCloth);
                    System.out.println("03.- Black/Gray Cloth               Q. "+Black_GrayCloth);
                    System.out.println("04.- Red/Black Suede Effect-Fabric  Q. "+Red_BlackSuedeEffectFabric);
                    System.out.println("Seleccione el color del Vehiculo: ");
                    opcion = sn.nextInt();
                    switch(opcion){
                         case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: CONÓMIVO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally         Q. "+EconomicoVersionRally);
                    System.out.println("Gray Cloth                      Q.     "+GrayCloth);
                    System.out.println("Total a pagar :                 Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: CONÓMIVO VERSIÓN RALLY");
                    System.out.println("EconomicoVersionRally       Q. "+EconomicoVersionRally);
                    System.out.println("Black Cloth                 Q.     "+BlackCloth);
                    System.out.println("Total a pagar :             Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: CONÓMIVO VERSIÓN RALLY");
                    System.out.println("EconomicoVersionRally     Q. "+EconomicoVersionRally);
                    System.out.println("Black/Gray Cloth          Q.     "+Black_GrayCloth);
                    System.out.println("Total a pagar :           Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: CONÓMIVO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally           Q. "+EconomicoVersionRally);
                    System.out.println("Red/Black Suede Effect-Fabric   Q.     "+Red_BlackSuedeEffectFabric);
                    System.out.println("Total a pagar :                 Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;    
                    }
                                 break;         //TERCERA AMENIDAD
                                 
                             case 4: //CUARTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMIVO VERSIÓN RALLY ");
                    System.out.println("Tipos de Aros");
                    System.out.println("1.- Aro de 15 pulgadas  Q.    "+pulgadas_15);
                    System.out.println("2.- Aro de 16 pulgadas  Q.    "+pulgadas_16);
                    System.out.println("3.- Aro de 17 pulgadas  Q. "+pulgadas_17);
                    System.out.println("4.- Aro de 18 pulgadas  Q. "+pulgadas_18);
                    System.out.println("5.- Aro de 19 pulgadas  Q. "+pulgadas_19);
                    System.out.println("Selecciones el tamaño del Aro: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally    Q. "+EconomicoVersionRally );
                    System.out.println("15 pulgadas                Q.     "+pulgadas_15);
                    System.out.println("Total a pagar :            Q. "+EconomicoVersionRally );
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally            Q. "+EconomicoVersionRally );
                    System.out.println("16 pulgadas      Q.     "+pulgadas_16);
                    System.out.println("Total a pagar :  Q. "+EconomicoVersionRally);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally     Q. "+EconomicoVersionRally);
                    System.out.println("17 pulgadas                 Q.  "+pulgadas_17);
                    System.out.println("Total a pagar :             Q. "+total280);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("EconomicoVersionRally       Q. "+EconomicoVersionRally );
                    System.out.println("18 pulgadas                 Q.  "+pulgadas_18);
                    System.out.println("Total a pagar :             Q. "+total281);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                            case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally     Q. "+EconomicoVersionRally );
                    System.out.println("19 pulgadas                 Q.  "+pulgadas_19);
                    System.out.println("Total a pagar :             Q. "+total282);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                     }
                                 break; // CUARTA AMENIDAD
                                 
                             case 5: //QUINTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Accesorios Exteriores");
                    System.out.println("1.- Body Side Molding                 Q."+BodySideMolding);
                    System.out.println("2.- Car Cover                         Q."+CarCover);
                    System.out.println("3.- Decklid Spoiler                   Q."+DecklidSpoiler);
                    System.out.println("4.- Door Edge Film                    Q. "+DoorEdgeFilm);
                    System.out.println("5.- Door Edge Guards                  Q. "+DoorEdgeGuards);
                    System.out.println("6.- Door Trim Chrome                  Q."+DoorTrimChrome);
                    System.out.println("7.- Door Visor                        Q."+DoorVisor);
                    System.out.println("8.- Front Fender Emblems              Q. "+FrontFenderEmblems);
                    System.out.println("9.- Rear Bumper Applique              Q. "+RearBumperApplique);
                    System.out.println("10.- Fog Lights                       Q."+FogLights);
                    System.out.println("11.- Nose Mascs                       Q."+NoseMascs);
                    System.out.println("12.- Moonrof Visor                    Q."+MoonrofVisor);
                    System.out.println("13.- Splash Guard Set                 Q."+SplashGuardSet);
                    System.out.println("14.- Dust Cover                       Q."+DustCover);
                    System.out.println("15.- Door Mirror Cover - Carbon Fiber Q."+DoorMirrorCoverCarbonFiber);
                    System.out.println("Seleccione el Accesorio exterior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally    Q. "+EconomicoVersionRally);
                    System.out.println("Body Side Molding          Q.   "+BodySideMolding);
                    System.out.println("Total a pagar :            Q. "+total283);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally        Q. "+EconomicoVersionRally);
                    System.out.println("Car Cover                      Q.   "+CarCover);
                    System.out.println("Total a pagar :                Q. "+total284);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally        Q. "+EconomicoVersionRally);
                    System.out.println("Decklid Spoiler                Q.   "+DecklidSpoiler);
                    System.out.println("Total a pagar :                Q. "+total285);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally        Q. "+EconomicoVersionRally);
                    System.out.println("Door Edge Film                 Q.    "+DoorEdgeFilm);
                    System.out.println("Total a pagar :                Q. "+total286);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: COUPE ");
                    System.out.println("Economico Version Rally     Q. "+EconomicoVersionRally);
                    System.out.println("Door Edge Guards            Q.    "+DoorEdgeGuards);
                    System.out.println("Total a pagar :             Q. "+total287);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally        Q. "+EconomicoVersionRally);
                    System.out.println("Door Trim Chrome             Q.   "+DoorTrimChrome);
                    System.out.println("Total a pagar :              Q. "+total288);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally        Q. "+EconomicoVersionRally);
                    System.out.println("Door Visor                   Q.   "+DoorVisor);
                    System.out.println("Total a pagar :              Q. "+total289);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("CEconomicoVersionRally      Q. "+EconomicoVersionRally);
                    System.out.println("Front Fender Emblems        Q.    "+FrontFenderEmblems);
                    System.out.println("Total a pagar :             Q. "+total290);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama:ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally       Q. "+EconomicoVersionRally);
                    System.out.println("Rear Bumper Applique        Q.    "+RearBumperApplique);
                    System.out.println("Total a pagar :             Q. "+total291);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally       Q. "+EconomicoVersionRally);
                    System.out.println("Fog Lights                  Q.   "+FogLights);
                    System.out.println("Total a pagar :             Q. "+total292);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally      Q. "+EconomicoVersionRally);
                    System.out.println("Nose Mascs                 Q.   "+NoseMascs);
                    System.out.println("Total a pagar :            Q. "+total293);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 12:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally    Q. "+EconomicoVersionRally);
                    System.out.println("Moonrof Visor            Q.   "+MoonrofVisor);
                    System.out.println("Total a pagar :          Q. "+total294);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                        break;
                           
                        case 13:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally    Q. "+EconomicoVersionRally);
                    System.out.println("Splash Guard Set           Q.   "+SplashGuardSet);
                    System.out.println("Total a pagar :            Q. "+total295);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 14:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally   Q. "+EconomicoVersionRally);
                    System.out.println("Dust Cover                Q.   "+DustCover);
                    System.out.println("Total a pagar :           Q. "+total296);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                            
                        case 15:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally            Q. "+EconomicoVersionRally);
                    System.out.println("Door Mirror Cover-Carbon Fiber     Q.   "+DoorMirrorCoverCarbonFiber);
                    System.out.println("Total a pagar :                    Q. "+total297);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;           
                    }
                                 break;// QUINTA AMENIDAD
                                 
                             case 6: //SEXTA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Accesorios Interiores");
                    System.out.println("1.- All-Seasons Floor Mats         Q."+All_SeasonFloorMats);
                    System.out.println("2.- Automatic-Dimming Mirror       Q."+Automatic_DimmingMirror);
                    System.out.println("3.- Cargo Hook                     Q. "+CargoHook);
                    System.out.println("4.- Cargo Net                      Q. "+CargoNet);
                    System.out.println("5.- Console Illumination           Q."+ConsoleIllumination);
                    System.out.println("6.- Cargo Organizer                Q. "+CargoOrganizer);
                    System.out.println("7.- Door Panel Protector           Q."+DoorPanelProtector);
                    System.out.println("8.- Armrest Compartiment           Q."+ArmrestCompartiment);
                    System.out.println("9.- Door Sill Trim-Illuminated     Q."+DoorSillTrim_Illuminated);
                    System.out.println("10.- Cargo Cover                   Q."+CargoCover);
                    System.out.println("11.- Cargo Liner                   Q."+CargoLiner);
                    System.out.println("Seleccione el Accesorio Interior que desee: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                        case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally    Q. "+EconomicoVersionRally);
                    System.out.println("All-Seasons Floor Mats   Q.   "+All_SeasonFloorMats);
                    System.out.println("Total a pagar :          Q. "+total298);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally      Q. "+EconomicoVersionRally);
                    System.out.println("Automatic-Dimming Mirror   Q.   "+Automatic_DimmingMirror);
                    System.out.println("Total a pagar :            Q. "+total299);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally       Q. "+EconomicoVersionRally);
                    System.out.println("Cargo Hook                  Q.    "+CargoHook);
                    System.out.println("Total a pagar :             Q. "+total300);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally   Q. "+EconomicoVersionRally);
                    System.out.println("Cargo Net               Q.    "+CargoNet);
                    System.out.println("Total a pagar :         Q. "+total301);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("EconomicoVersionRallyb   Q. "+EconomicoVersionRally);
                    System.out.println("Console Illumination    Q.   "+ConsoleIllumination);
                    System.out.println("Total a pagar :         Q. "+total302);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Economico Version Rally   Q. "+EconomicoVersionRally);
                    System.out.println("Cargo Organizer           Q.   "+CargoOrganizer);
                    System.out.println("Total a pagar :           Q. "+total303);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt(); 
                            break;
                            
                        case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally   Q. "+EconomicoVersionRally);
                    System.out.println("Door Panel Protector    Q.   "+DoorPanelProtector);
                    System.out.println("Total a pagar :         Q. "+total304);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 8:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally    Q. "+EconomicoVersionRally);
                    System.out.println("Armrest Compartiment     Q.   "+ArmrestCompartiment);
                    System.out.println("Total a pagar :          Q. "+total305);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 9:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("HEconomicoVersionRally        Q. "+EconomicoVersionRally );
                    System.out.println("Door Sill Trim-Illuminated    Q.   "+DoorSillTrim_Illuminated);
                    System.out.println("Total a pagar :               Q. "+total306);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 10:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally     Q. "+EconomicoVersionRally );
                    System.out.println("Cargo Cover                 Q.   "+CargoCover);
                    System.out.println("Total a pagar :             Q. "+total307);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 11:
                            System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY");
                    System.out.println("Economico Version Rally     Q. "+EconomicoVersionRally );
                    System.out.println("Cargo Liner                 Q.   "+CargoLiner);
                    System.out.println("Total a pagar :             Q. "+total308);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break; 
                    }
                                 break; // SEXTA AMENIDAD
     
                             case 7: // SEPTIMA AMENIDAD
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("Accesorios Eletrónicos");
                    System.out.println("1.-Wireless Phone Charger Q."+WirelllesPhoneCharger);
                    System.out.println("2.-USB Charger - 2.1 Amp. Q."+USBCharger_2Amp);
                    System.out.println("3.-Puddle Light           Q."+PuddleLight);
                    System.out.println("4.-Parking Sensors        Q."+ParkingSensors);
                    System.out.println("Seleccione el Accesorio Electrónico: ");
                    opcion = sn.nextInt();
                    switch (opcion){
                      case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY  ");
                    System.out.println("EconomicoVersionRally    Q. "+EconomicoVersionRally );
                    System.out.println("Wireless Phone Charger   Q.   "+WirelllesPhoneCharger);
                    System.out.println("Total a pagar :          Q. "+total309);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY  ");
                    System.out.println("EconomicoVersionRally     Q. "+EconomicoVersionRally );
                    System.out.println("USB Charger - 2.1 Amp.    Q.   "+USBCharger_2Amp);
                    System.out.println("Total a pagar :           Q. "+total310);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally    Q. "+EconomicoVersionRally );
                    System.out.println("Puddle Light             Q.    "+PuddleLight);
                    System.out.println("Total a pagar :          Q. "+total311);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;
                            
                        case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println("Ha seleccionado la gama: ECONÓMICO VERSIÓN RALLY ");
                    System.out.println("EconomicoVersionRally   Q. "+EconomicoVersionRally );
                    System.out.println("Parking Sensors         Q.   "+ParkingSensors);
                    System.out.println("Total a pagar :         Q. "+total312);
                    System.out.println("Digite el numero 2 para ir al menu");
                    opcion =sn.nextInt();
                            break;  
                    }
                                 break; // SEPTIMA AMENIDAD
                    }//FINALIZA PIRMERA AMENIDAD
                    }
                            break;
                            
                            case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("     CONSENCIONARIO DE AUTOS\n - SELECCION DE GAMA DE VEHICULO -\n ------------------------------------");
                    System.out.println(" USTED SELECCIONO NO AGREGAR NINGUNA AMENIDAD");
                    System.out.println("Gama seleccionada: ECONÓMICO VERSIÓN RALLY      Q. "+EconomicoVersionRally);
                    System.out.println("Amenidades: Ninguna                             Q.     "+Ninguno);
                    System.out.println("Total a Pagar:                                  Q. "+EconomicoVersionRally);
                    System.out.println("Digite el Numero 2 para Regresar"); 
                    opcion = sn.nextInt();
                            break;
                    } // PRIMER SWITCH DEL VEHICULO ECONOMICO VERSION RALLY NOVENO VEHICULO
                            break; // MENU DEL NOVENO VEHICULO
                            
                            case 10: //MENU PARA REGRESAR A LA PANTALLA ANTERIOR
                                salir = false ; 
                            break; // MENU PARA REGRESAR A LA PANTALLA ANTERIOR         
                    }// SE CIERRA LLAVA DEL PRIMER VEHICULO SEDAN ECONOMICO
                    break; // DEL PRIMER SWITCH YA SE SEÑALO
                    
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Las Opciones son entre 1 y 2");          
                } //FIN DE LA CUARTA LLAVE DEL PRIMER SWITCH    
        }//FEN DE LA TERCERA LLAVE DEL WHILE                    
  } // FIN DE LA SEGUNDA LLAVE
  } //FIN DE LA PRIMERA LLAVE
