# Converting-files

Codding by : Tomer Maabari and Ortal Hanoch
Computer since and Math , Ariel University.

# This points can be represet on google earth with Latitude, Longitude and Altitude with kml files.

# Coords
* The class MyCoords implements the interface coords_convert
  calculates the vector, azimuth, elevation, distance and domain between two 3D points and vectors.

# GIS
Project contains > Layers the contains > Elements the contains > MetaDatas and Points
* Mata Data 
* Element
* Layer
* Project

# File_format
* Class CSVReader have a function that reads the csv file thats only if difine Latitude, Longitude and Altitude inside the file.
  Puts all the info in Layer.

* Class Csv2kml have a function that converts csv file to a kml.
  the convert function gets a project and write the info into a kml version.
  Puts all the info in Project.

* Class MultiCSV have a function that finds the csv files only, reads them and convert them.
  Puts all the layers to a one project.
