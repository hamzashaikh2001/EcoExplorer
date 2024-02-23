# EcoExplorer
An API for exploring ecological data of different regions in the United States.

# How To Use:
Run the program and open http://localhost:8080/

To obtain all data at a specific zip code:
http://localhost:8080/api/zips/{zipCode}

To obtain all region data (currently not implemented):
http://localhost:8080/api/regiondata

To obtain region data from a specific zip code:
http://localhost:8080/api/regiondata/zips/{zipCode}

To obtain all water data (currently not implemented:
http://localhost:8080/api/waterdata

To obtain water data from a specific zip code:
http://localhost:8080/api/waterdata/zips/{zipCode}

To obtain water data from a specific public water system ID (PWSID)
http://localhost:8080/api/waterdata/pwsids/{pwsID}

# Example:
Both 5 and 9-digit zips are accepted. 9 digit zips should be put in as XXXXX-XXXX.

http://localhost:8080/api/zips/80202

or

http://localhost:8080/api/zips/80202-2822

# Datasets

Water Quality Data:

https://sdwis.epa.gov/ords/sfdw_pub/r/sfdw/sdwis_fed_reports_public/200

Air Quality Data:

https://sedac.ciesin.columbia.edu/data/set/aqdh-pm2-5-o3-no2-concentrations-zipcode-contiguous-us-2000-2016/data-download

Zip Data:

https://www.unitedstateszipcodes.org/zip-code-database/
