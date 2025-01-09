package StarMass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy(){
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject c) {
        this.celestialObjects.add(c);
    }

    public Map<String, Integer> computeMassRepartition() {
        List<CelestialObject> mylist = this.getCelestialObjects();
        Map<String, Integer> resmap = new HashMap<>(Map.ofEntries(
            entry("Planet", 0), entry("Star", 0), entry("Other", 0)
        ));
        for(CelestialObject c : mylist){
            if(c instanceof Planet){
                resmap.put("Planet", resmap.get("Planet") + c.getMass());
            }
            else if (c instanceof Star){
                resmap.put("Star", resmap.get("Star") + c.getMass());
            }
            else {
                resmap.put("Other", resmap.get("Other") + c.getMass());
            }
        }
        return resmap;
    }

}
