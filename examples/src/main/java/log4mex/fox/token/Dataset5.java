package log4mex.fox.token;

import org.aksw.mex.log4mex.MEXSerializer;
import org.aksw.mex.log4mex.MyMEX;
import org.aksw.mex.log4mex.algo.AlgorithmVO;
import org.aksw.mex.util.MEXConstant;
import org.aksw.mex.util.MEXEnum.*;

import java.util.Date;

/**
 * Created by esteves on 27.06.15.
 */
public class Dataset5 {

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
            mex.setContext(EnumContexts.RECOMENDER_SYSTEMS);
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
            //mex.Configuration(eid).addModel("svm20150322", "model generated by LibSVM", new Date());
            mex.Configuration(eid).setSamplingMethod(EnumSamplingMethods.CROSS_VALIDATION, 10);
            mex.Configuration(eid).SamplingMethod().setTrainSize(0.9);
            mex.Configuration(eid).SamplingMethod().setTestSize(0.1);
            mex.Configuration(eid).SamplingMethod().setSequential(true);

            mex.Configuration(eid).addHardwareConfiguration("ubuntu", EnumProcessors.INTEL_COREI7, EnumRAM.SIZE_16GB, "SSD", EnumCaches.CACHE_3MB);


            mex.Configuration(eid).DataSet().setName("web");
            mex.Configuration(eid).DataSet().setDescription("ataset consists of 20 annotated Web sites");
            mex.Configuration(eid).DataSet().setURI("http://l2r.cs.uiuc.edu/∼cogcomp/software.php");

        }

        //adding algorithms and parameters
        AlgorithmVO alg1,alg2,alg3,alg4,alg5,alg6,alg7,alg8,alg9,alg10,alg11,alg12,alg13,alg14,alg15,alg16,alg17,alg18,alg19;
        {
            //mex.Configuration(eid).addImplementation(EnumImplementations., "3.6.6");

            alg1 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.BaggingJ48);
            alg2 = mex.Configuration(eid).addAlgorithm(EnumAlgorithms.SequentialMinimalOptimization);
            alg3 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.AdditiveLogisticRegression);
            alg4 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.DecisionTable);
            alg5 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.NaiveBayes);
            alg6 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.SimpleVoting);
            alg7 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.LogisticModelTrees);
            alg8 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.NER_OPEN_NLP);
            alg9 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.MultilayerPerceptron);
            alg10 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.J48);
            alg11 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.NER_STANFORD);
            alg12 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.SupportVectorMachines);
            alg13 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.NER_ILLINOIS_EXTENDED);
            alg14 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.FunctionalTrees);
            alg15 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.AdaBoostM1);
            alg16 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.ClassLevelVoting);
            alg17 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.NER_BALIE);
            alg18 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.RandomForest);
            alg19 =mex.Configuration(eid).addAlgorithm(EnumAlgorithms.LogisticRegression);

            String[] param = {"C", "10^3", "alpha", "0.2"};
            alg1.addParameter(param);
        }
        

        String ex1 = "EX001";
        String ex2 = "EX002";
        String ex3 = "EX003";
        String ex4 = "EX004";
        String ex5 = "EX005";
        String ex6 = "EX006";
        String ex7 = "EX007";
        String ex8 = "EX008";
        String ex9 = "EX009";
        String ex10 = "EX010";
        String ex11 = "EX011";
        String ex12 = "EX012";
        String ex13 = "EX013";
        String ex14 = "EX014";
        String ex15 = "EX015";
        String ex16 = "EX016";
        String ex17 = "EX017";
        String ex18 = "EX018";
        String ex19 = "EX019";
        
        //associate your run x each algorithm
        {
            mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex1).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex1).setAlgorithm(mex.Configuration(eid).Algorithm(EnumAlgorithms.BaggingJ48));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.RECALL, .96);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.PRECISION, .70);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.FMEASURE, .70);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.ERROR, .70);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.MCC_MATTHEWS_COR_COEF, .70);



                //your models call here !
            mex.Configuration(eid).Execution(ex1).setEndDate(new Date());
        }
        
        
        {
            mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
            mex.Configuration(eid).setExecutionId(1, ex2);

            mex.Configuration(eid).Execution(ex2).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex2).setAlgorithm(mex.Configuration(eid).Algorithm(EnumAlgorithms.SupportVectorMachines));
            mex.Configuration(eid).Execution(ex2).setStartsAtPosition("1377");
            mex.Configuration(eid).Execution(ex2).setEndsAtPosition("1420");

                //your models call here !
            mex.Configuration(eid).Execution(ex2).setEndDate(new Date());

            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.ERROR, .04);
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.ACCURACY, .83);
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.TRUEPOSITIVERATE, .61);

        //saving performances for each run
        }


            try{
                MEXSerializer.getInstance().saveToDisk("../metafiles/log4mex/fox/ex004", "http://mex.aksw.org/examples/", mex, MEXConstant.EnumRDFFormats.JSON_LD);
            }catch (Exception e){
                System.out.print(e.toString());
            }

            System.out.println("The MEX file [ex004] has been successfully created: share it ;-)");

        System.exit(0);

        }catch (Exception e){
            System.out.println(e.toString());
        }


    }

}
