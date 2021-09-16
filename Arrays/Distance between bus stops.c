// C code to find distance between bus stops
// https://leetcode.com/problems/distance-between-bus-stops/

int distanceBetweenBusStops(int* distance, int distanceSize, int start, int destination){
    unsigned long int i, clockwise=0, anticlockwise=0,temp;
    if(start > destination){
        temp = start;
        start = destination;
        destination = temp;
    }
    
    for (i=start; i<destination; i++){
        clockwise = distance[i] + clockwise;
    }
    
    for(i=distanceSize-1; i>=destination; i--){
        anticlockwise = distance[i] + anticlockwise;
    }
    
    if(start > 0){
        for(i=0; i<start; i++){
            anticlockwise = distance[i] + anticlockwise;
        }
    }
    
    if(clockwise <= anticlockwise){
        return clockwise;
    }
    else{
        return anticlockwise;
    }
}
