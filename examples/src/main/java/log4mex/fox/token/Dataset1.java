package log4mex.fox.token;

import org.aksw.mex.log4mex.MEXSerializer;
import org.aksw.mex.log4mex.MyMEX;
import org.aksw.mex.log4mex.algo.AlgorithmVO;
import org.aksw.mex.util.MEXConstant;
import org.aksw.mex.util.MEXEnum.*;

import java.util.Date;

/**
 * Created by Moussallem on 26.04.16.
 */
public class Dataset1 {

    public static void main(String[] args) {

        System.out.println("starting Fox");

        //the MEX wrapper!
        MyMEX mex = new MyMEX();

        try{

        //basic authoring provenance
        {
            //change later here the sets for adds
            mex.setAuthorName("René Speck");
            mex.setAuthorEmail("speck@informatik.uni-leipzig.de");
            mex.setContext(EnumContexts.NAMED_ENTITY_RECOGNITION);
            mex.setOrganization("Leipzig University");

            mex.setExperimentId("E1_token");
            mex.setExperimentTitle("token-based experiment");
            mex.setExperimentDate(new Date());
            mex.setExperimentDescription("Token-based evaluation on 15 ensemble learning algorithms");
        }

        String eid = "E001S001";
        //ml-experiment-configuration
        {
            mex.addConfiguration(eid);

            mex.Configuration(eid).setDescription("analyzing 10-fold cross validation for 15 algorithms");
            //mex.Configuration(eid).setModel("svm20150322", "model generated by LibSVM", new Date());
            mex.Configuration(eid).setSamplingMethod(EnumSamplingMethods.CROSS_VALIDATION, 10);
            mex.Configuration(eid).SamplingMethod().setTrainSize(0.9);
            mex.Configuration(eid).SamplingMethod().setTestSize(0.1);
            mex.Configuration(eid).SamplingMethod().setSequential(true);

            mex.Configuration(eid).setHardwareConfiguration("ubuntu", EnumProcessors.INTEL_COREI7, EnumRAM.SIZE_16GB, "SSD", EnumCaches.CACHE_3MB);


            mex.Configuration(eid).DataSet().setName("News ");
            mex.Configuration(eid).DataSet().setDescription("consists of text from newspaper articles and was re-annotated manually by the authors to ensure high data quality.");
            mex.Configuration(eid).DataSet().setURI("https://github.com/AKSW/FOX/tree/master/input/1");

        }

        //adding algorithms and parameters
        AlgorithmVO alg1,alg2,alg3,alg4,alg5,alg6,alg7,alg8,alg9,alg10,alg11,alg12,alg13,alg14,alg15,alg16,alg17,alg18,alg19;
        {
            //mex.Configuration(eid).setImplementation(EnumImplementations., "3.6.6");

            alg1 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.BaggingJ48);
            alg2 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.SequentialMinimalOptimization);
            alg3 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.AdditiveLogisticRegression);
            alg4 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.DecisionTable);
            alg5 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.NaiveBayes);
            alg6 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.SimpleVoting);
            alg7 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.LogisticModelTrees);
            alg8 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.NER_OPEN_NLP);
            alg9 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.MultilayerPerceptron);
            alg10 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.J48);
            alg11 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.NER_STANFORD);
            alg12 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.SupportVectorMachines);
            alg13 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.NER_ILLINOIS_EXTENDED);
            alg14 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.FunctionalTrees);
            alg15 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.AdaBoostM1);
            alg16 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.ClassLevelVoting);
            alg17 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.NER_BALIE);
            alg18 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.RandomForest);
            alg19 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.LogisticRegression);

            String[] param = {"C", "10^3", "alpha", "0.2"};
            alg1.addParameter(param);
        }

        String ex1;
        String ex2;
        String ex3;
        String ex4;
        String ex5;
        String ex6;
        String ex7;
        String ex8;
        String ex9;
        String ex10;
        String ex11;
        String ex12;
        String ex13;
        String ex14;
        String ex15;
        String ex16;
        String ex17;
        String ex18;
        String ex19;
        
        //associate your run x each algorithm
        {
            ex1 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);

            mex.Configuration(eid).Execution(ex1).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex1).setAlgorithm(alg1);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.RECALL, .9311);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.PRECISION, .9249);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.FMEASURE, .9279);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.ERROR, .52);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .925);

                //your models call here !
            mex.Configuration(eid).Execution(ex1).setEndDate(new Date());
        }
        
        
         {
            ex2 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex2).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex2).setAlgorithm(alg2);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.RECALL, .9215);
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.PRECISION, .9190);
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.FMEASURE, .9201);
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.ERROR, .57);
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .917);

                //your models call here !
            mex.Configuration(eid).Execution(ex2).setEndDate(new Date());
        }
         
                 {
            ex3 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex3).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex3).setAlgorithm(alg3);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex3).addPerformance(EnumMeasures.RECALL, .9142);
            mex.Configuration(eid).Execution(ex3).addPerformance(EnumMeasures.PRECISION, .9132);
            mex.Configuration(eid).Execution(ex3).addPerformance(EnumMeasures.FMEASURE, .9134);
            mex.Configuration(eid).Execution(ex3).addPerformance(EnumMeasures.ERROR, .62);
            mex.Configuration(eid).Execution(ex3).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .91);

                //your models call here !
            mex.Configuration(eid).Execution(ex3).setEndDate(new Date());
        }
                 
                {
            ex4 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex4).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex4).setAlgorithm(alg4);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex4).addPerformance(EnumMeasures.RECALL, .9364);
            mex.Configuration(eid).Execution(ex4).addPerformance(EnumMeasures.PRECISION, .9210);
            mex.Configuration(eid).Execution(ex4).addPerformance(EnumMeasures.FMEASURE, .9286);
            mex.Configuration(eid).Execution(ex4).addPerformance(EnumMeasures.ERROR, .51);
            mex.Configuration(eid).Execution(ex4).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .926);

                //your models call here !
            mex.Configuration(eid).Execution(ex4).setEndDate(new Date());
        }
                
                        {
           ex5 =  mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex5).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex5).setAlgorithm(alg5);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex5).addPerformance(EnumMeasures.RECALL, .9336);
            mex.Configuration(eid).Execution(ex5).addPerformance(EnumMeasures.PRECISION, .8617);
            mex.Configuration(eid).Execution(ex5).addPerformance(EnumMeasures.FMEASURE, .8958);
            mex.Configuration(eid).Execution(ex5).addPerformance(EnumMeasures.ERROR, .77);
            mex.Configuration(eid).Execution(ex5).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .893);

                //your models call here !
            mex.Configuration(eid).Execution(ex5).setEndDate(new Date());
        }
                        
                                {
            ex6 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex6).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex6).setAlgorithm(alg6);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex6).addPerformance(EnumMeasures.RECALL, .8313);
            mex.Configuration(eid).Execution(ex6).addPerformance(EnumMeasures.PRECISION, .6914);
            mex.Configuration(eid).Execution(ex6).addPerformance(EnumMeasures.FMEASURE, .7303);
            mex.Configuration(eid).Execution(ex6).addPerformance(EnumMeasures.ERROR, 2.36);
            mex.Configuration(eid).Execution(ex6).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .735);
          
                //your models call here !
            mex.Configuration(eid).Execution(ex6).setEndDate(new Date());
        }

                                        {
            ex7 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex7).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex7).setAlgorithm(alg7);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex7).addPerformance(EnumMeasures.RECALL, .9373);
            mex.Configuration(eid).Execution(ex7).addPerformance(EnumMeasures.PRECISION, .9216);
            mex.Configuration(eid).Execution(ex7).addPerformance(EnumMeasures.FMEASURE, .9294);
            mex.Configuration(eid).Execution(ex7).addPerformance(EnumMeasures.ERROR, .51);
            mex.Configuration(eid).Execution(ex7).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .927);

                //your models call here !
            mex.Configuration(eid).Execution(ex7).setEndDate(new Date());
        }
                                        
                                                {
           ex8 =  mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex8).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex8).setAlgorithm(alg8);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex8).addPerformance(EnumMeasures.RECALL, .7521);
            mex.Configuration(eid).Execution(ex8).addPerformance(EnumMeasures.PRECISION, .7441);
            mex.Configuration(eid).Execution(ex8).addPerformance(EnumMeasures.FMEASURE, .7371);
            mex.Configuration(eid).Execution(ex8).addPerformance(EnumMeasures.ERROR, 2.06);
            mex.Configuration(eid).Execution(ex8).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .732);

                //your models call here !
            mex.Configuration(eid).Execution(ex8).setEndDate(new Date());
        }
                                                
                                                        {
            ex9 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex9).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex9).setAlgorithm(alg9);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex9).addPerformance(EnumMeasures.RECALL, .9322);
            mex.Configuration(eid).Execution(ex9).addPerformance(EnumMeasures.PRECISION, .9226);
            mex.Configuration(eid).Execution(ex9).addPerformance(EnumMeasures.FMEASURE, .9273);
            mex.Configuration(eid).Execution(ex9).addPerformance(EnumMeasures.ERROR, .52);
            mex.Configuration(eid).Execution(ex9).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .925);
                //your models call here !
            mex.Configuration(eid).Execution(ex9).setEndDate(new Date());
        }
                                                        
                                                                {
            ex10 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex10).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex10).setAlgorithm(alg10);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex10).addPerformance(EnumMeasures.RECALL, .935);
            mex.Configuration(eid).Execution(ex10).addPerformance(EnumMeasures.PRECISION, .922);
            mex.Configuration(eid).Execution(ex10).addPerformance(EnumMeasures.FMEASURE, .9284);
            mex.Configuration(eid).Execution(ex10).addPerformance(EnumMeasures.ERROR, .52);
            mex.Configuration(eid).Execution(ex10).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .926);

                //your models call here !
            mex.Configuration(eid).Execution(ex10).setEndDate(new Date());
        }
                                                                
                                                                       {
            ex11 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex11).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex11).setAlgorithm(alg11);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex11).addPerformance(EnumMeasures.RECALL, .927);
            mex.Configuration(eid).Execution(ex11).addPerformance(EnumMeasures.PRECISION, .8809);
            mex.Configuration(eid).Execution(ex11).addPerformance(EnumMeasures.FMEASURE, .9034);
            mex.Configuration(eid).Execution(ex11).addPerformance(EnumMeasures.ERROR, .68);
            mex.Configuration(eid).Execution(ex11).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .9);

                //your models call here !
            mex.Configuration(eid).Execution(ex11).setEndDate(new Date());
        }
                                                                       
                                                                               {
            ex12 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex12).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex12).setAlgorithm(alg12);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex12).addPerformance(EnumMeasures.RECALL, .9219);
            mex.Configuration(eid).Execution(ex12).addPerformance(EnumMeasures.PRECISION, .9249);
            mex.Configuration(eid).Execution(ex12).addPerformance(EnumMeasures.FMEASURE, .9231);
            mex.Configuration(eid).Execution(ex12).addPerformance(EnumMeasures.ERROR, .54);
            mex.Configuration(eid).Execution(ex12).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .92);

                //your models call here !
            mex.Configuration(eid).Execution(ex12).setEndDate(new Date());
        }
                                                                               
                                                                                       {
            ex13 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex13).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex13).setAlgorithm(alg13);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex13).addPerformance(EnumMeasures.RECALL, .8243);
            mex.Configuration(eid).Execution(ex13).addPerformance(EnumMeasures.PRECISION, .7811);
            mex.Configuration(eid).Execution(ex13).addPerformance(EnumMeasures.FMEASURE, .8020);
            mex.Configuration(eid).Execution(ex13).addPerformance(EnumMeasures.ERROR, 1.37);
            mex.Configuration(eid).Execution(ex13).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .795);

                //your models call here !
            mex.Configuration(eid).Execution(ex13).setEndDate(new Date());
        }
                                                                                       
                                                                                               {
           ex14 =  mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex14).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex14).setAlgorithm(alg14);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex14).addPerformance(EnumMeasures.RECALL, .9344);
            mex.Configuration(eid).Execution(ex14).addPerformance(EnumMeasures.PRECISION, .9215);
            mex.Configuration(eid).Execution(ex14).addPerformance(EnumMeasures.FMEASURE, .9279);
            mex.Configuration(eid).Execution(ex14).addPerformance(EnumMeasures.ERROR, .52);
            mex.Configuration(eid).Execution(ex14).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .925);

                //your models call here !
            mex.Configuration(eid).Execution(ex14).setEndDate(new Date());
        }
                                                                                               
                                                                                                       {
            ex15 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex15).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex15).setAlgorithm(alg15);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex15).addPerformance(EnumMeasures.RECALL, .9349);
            mex.Configuration(eid).Execution(ex15).addPerformance(EnumMeasures.PRECISION, .9217);
            mex.Configuration(eid).Execution(ex15).addPerformance(EnumMeasures.FMEASURE, .9283);
            mex.Configuration(eid).Execution(ex15).addPerformance(EnumMeasures.ERROR, .52);
            mex.Configuration(eid).Execution(ex15).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .926);

                //your models call here !
            mex.Configuration(eid).Execution(ex15).setEndDate(new Date());
        }
                                                                                                       
                                                                                                               {
            ex16 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex16).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex16).setAlgorithm(alg16);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex16).addPerformance(EnumMeasures.RECALL, .9270);
            mex.Configuration(eid).Execution(ex16).addPerformance(EnumMeasures.PRECISION, .8809);
            mex.Configuration(eid).Execution(ex16).addPerformance(EnumMeasures.FMEASURE, .9034);
            mex.Configuration(eid).Execution(ex16).addPerformance(EnumMeasures.ERROR, .68);
            mex.Configuration(eid).Execution(ex16).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .98);

                //your models call here !
            mex.Configuration(eid).Execution(ex16).setEndDate(new Date());
        }

                                                                                                                       {
           ex17 =  mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex17).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex17).setAlgorithm(alg17);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex17).addPerformance(EnumMeasures.RECALL, .7081);
            mex.Configuration(eid).Execution(ex17).addPerformance(EnumMeasures.PRECISION, .7286);
            mex.Configuration(eid).Execution(ex17).addPerformance(EnumMeasures.FMEASURE, .7154);
            mex.Configuration(eid).Execution(ex17).addPerformance(EnumMeasures.ERROR, 1.90);
            mex.Configuration(eid).Execution(ex17).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, 0.707);

                //your models call here !
            mex.Configuration(eid).Execution(ex17).setEndDate(new Date());
        }
                                                                                                                               {
            ex18 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex18).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex18).setAlgorithm(alg18);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex18).addPerformance(EnumMeasures.RECALL, .9356);
            mex.Configuration(eid).Execution(ex18).addPerformance(EnumMeasures.PRECISION, .9219);
            mex.Configuration(eid).Execution(ex18).addPerformance(EnumMeasures.FMEASURE, .9287);
            mex.Configuration(eid).Execution(ex18).addPerformance(EnumMeasures.ERROR, .51);
            mex.Configuration(eid).Execution(ex18).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .926);

                //your models call here !
            mex.Configuration(eid).Execution(ex18).setEndDate(new Date());
        }
                                                                                                                                       {
            ex19 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex19).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex19).setAlgorithm(alg19);
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex19).addPerformance(EnumMeasures.RECALL, .9138);
            mex.Configuration(eid).Execution(ex19).addPerformance(EnumMeasures.PRECISION, .9136);
            mex.Configuration(eid).Execution(ex19).addPerformance(EnumMeasures.FMEASURE, .9135);
            mex.Configuration(eid).Execution(ex19).addPerformance(EnumMeasures.ERROR, .63);
            mex.Configuration(eid).Execution(ex19).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .91);

                //your models call here !
            mex.Configuration(eid).Execution(ex19).setEndDate(new Date());
        }
                                                                                                                                       
            try{

                MEXSerializer.getInstance().saveToDisk("../metafiles/log4mex/fox/token/1", "http://mex.aksw.org/examples/", mex, MEXConstant.EnumRDFFormats.TTL);
            }catch (Exception e){
                System.out.print(e.toString());
            }

            System.out.println("The MEX file has been successfully created: share it ;-)");

        System.exit(0);

        }catch (Exception e){
            System.out.println(e.toString());
        }


    }

}
