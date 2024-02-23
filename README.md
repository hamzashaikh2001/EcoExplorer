# EcoExplorer

An API for exploring ecological data of different regions in the United States.

## Getting Started

1. Run the program and open [http://localhost:8080/](http://localhost:8080/).

2. To obtain all data at a specific zip code:
   ```
   http://localhost:8080/api/zips/{zipCode}
   ```

3. To obtain all region data (currently not implemented):
   ```
   http://localhost:8080/api/regiondata
   ```

4. To obtain region data from a specific zip code:
   ```
   http://localhost:8080/api/regiondata/zips/{zipCode}
   ```

5. To obtain all water data (currently not implemented):
   ```
   http://localhost:8080/api/waterdata
   ```

6. To obtain water data from a specific zip code:
   ```
   http://localhost:8080/api/waterdata/zips/{zipCode}
   ```

7. To obtain water data from a specific public water system ID (PWSID):
   ```
   http://localhost:8080/api/waterdata/pwsids/{pwsID}
   ```

## Examples

Both 5 and 9-digit zips are accepted. 9-digit zips should be put in as XXXXX-XXXX.

- For 5-digit zip:
  ```
  http://localhost:8080/api/zips/80202
  ```

- For 9-digit zip:
  ```
  http://localhost:8080/api/zips/80202-2822
  ```

## Datasets

- **Water Quality Data:**

  [EPA Water Quality Data](https://sdwis.epa.gov/ords/sfdw_pub/r/sfdw/sdwis_fed_reports_public/200)

- **Air Quality Data:**

  [SEDAC Air Quality Data](https://sedac.ciesin.columbia.edu/data/set/aqdh-pm2-5-o3-no2-concentrations-zipcode-contiguous-us-2000-2016/data-download)

- **Zip Data:**

  [US Zip Code Database](https://www.unitedstateszipcodes.org/zip-code-database/)
