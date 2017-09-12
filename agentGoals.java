private void agentGoals()	{
  //read in agentGoals from .CSV file
  String csvFile = "/Volumes/JetDrive/Drive/workspace/EngDModel2/src/data/NorfolkITNAGENTGOALS.csv";
  BufferedReader br = null;
  String line = "";
  String cvsSplitBy = ",";

try {
  Map<String, String> maps = new HashMap<String, String>();
  br = new BufferedReader(new FileReader(csvFile));
  while ((line = br.readLine()) != null) {
    // use comma as separator
    String[] agentGoals = line.split(cvsSplitBy);
    maps.putAll(agentGoals);
    }
  //loop map
  for (Map.Entry<String, String> entry : maps.entrySet()) {
    System.out.println("Country [code= " + entry.getKey() + " , name="
      + entry.getValue() + "]");
    }
  } catch (FileNotFoundException e) {
    e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
      }
finally {
  if (br != null) {
    try {
      br.close();
      } catch (IOException e) {
        e.printStackTrace();
        }
    }
  }
System.out.println("Finished reading goal locations for agents");
}
