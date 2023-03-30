import java.util.*;
class CountOfPath2D{
	public static void main(String[] args){
		//System.out.println(countPathRev(3,3));  ///-->1
		//ArrayList<String> list = pathRevRet("",3,3);
		//System.out.println(list);
		//System.out.println(pathRevRetDiagonally("",3,3));
		
		//pathRev("",3,3);//--->2
		//pathRevRet("",3,3);//--->3
		//boolean[][] maze = {{true,true,true},{true,false,true},{true,true,true}};//for pathWithObs 
		boolean[][] maze = {{true,true,true},{true,true,true},{true,true,true}};//for allPath
		//pathWithObs("",maze,0,0);
		//allPath("",maze,0,0); // --> important ,,backtracking
		int[][] arr = new int[maze.length][maze[0].length];
        allPathWithMatrix("",maze,0,0,arr,1);		
	}
	public static void pathWithObs(String p,boolean[][] maze,int r,int c){
		if(r == maze.length-1 && c == maze[0].length-1){
			System.out.println(p);
			return;
		}
		if(!maze[r][c])
			return;
		if(r < maze.length-1)
			pathWithObs(p+'V',maze,r+1,c);
		
		if(c < maze[0].length-1)
			pathWithObs(p+'H',maze,r,c+1);
	}
	public static ArrayList<String> pathRevRet(String p,int r,int c){
		if(r == 1 && c == 1){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		if(r>1){
			list.addAll(pathRevRet(p+'D',r-1,c));
		}
		if(c>1){
			list.addAll(pathRevRet(p+'R',r,c-1));
		}
		return list;
	}
	public static ArrayList<String> pathRevRetDiagonally(String p,int r,int c){
		if(r == 1 && c == 1){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		if(r>1){
			list.addAll(pathRevRetDiagonally(p+'V',r-1,c));
		}
		if(r>1 && c>1)
			list.addAll(pathRevRetDiagonally(p+'D',r-1,c-1));
		if(c>1){
			list.addAll(pathRevRetDiagonally(p+'R',r,c-1));
		}
		return list;
	}
			
	public static int countPathRev(int r,int c){
		if(r==1 || c==1)
			return 1;
		int left = countPathRev(r-1,c);
		int right = countPathRev(r,c-1);
		return left+right;
	}
	public static void pathRev(String p,int r,int c){
		if(r == 1 && c == 1){
			System.out.println(p);
			return;
		}
		if(r>1)
			pathRev(p+'D',r-1,c);
		if(c>1)
			pathRev(p+'R',r,c-1);
	}
	//For All path ,R,L,U,D
	public static void allPath(String p,boolean[][] maze,int r,int c){
		if(r == maze.length-1 && c == maze[0].length-1){
			System.out.println(p);
			return;
		}
		if(!maze[r][c])
			return;
		//
		maze[r][c] = false;  // this is used for backtracking
		/*  Backtracking means in this questin is travelled that path and comes to target
			make is false until the recussion call is exit for target,if the recursion 
			call comes to end and comes to your target then make the entire path that your
			recursive call travelled makes then true as they are true while u are not 
			travelled ..makeing true is done in line no.103
		*/
		if(r < maze.length-1)
			allPath(p+'D',maze,r+1,c); //for down move
		
		if(c < maze[0].length-1)
			allPath(p+'R',maze,r,c+1); // for right move
		if(r>0)    
			allPath(p+'U',maze,r-1,c); // for up move
		if(c>0)
			allPath(p+'L',maze,r,c-1);  // for Left move
		maze[r][c] = true; // this is used for backtracking
	}
	
	public static void allPathWithMatrix(String p,boolean[][] maze,int r,int c,int[][] path, int step){
		if(r == maze.length-1 && c == maze[0].length-1){
			path[r][c]=step;
			for(int[] arr : path){
				System.out.println(Arrays.toString(arr));
			}
			
			System.out.println(p);
			System.out.println("------------");
			return;
		}
		if(!maze[r][c])
			return;
		//
		maze[r][c] = false;  // this is used for backtracking
		path[r][c] = step;
		/*  Backtracking means in this questin is travelled that path and comes to target
			make is false until the recussion call is exit for target,if the recursion 
			call comes to end and comes to your target then make the entire path that your
			recursive call travelled makes then true as they are true while u are not 
			travelled ..makeing true is done in line no.103
		*/
		if(r < maze.length-1)
			allPathWithMatrix(p+'D',maze,r+1,c,path,step+1); //for down move
		
		if(c < maze[0].length-1)
			allPathWithMatrix(p+'R',maze,r,c+1,path,step+1); // for right move
		if(r>0)    
			allPathWithMatrix(p+'U',maze,r-1,c,path,step+1); // for up move
		if(c>0)
			allPathWithMatrix(p+'L',maze,r,c-1,path,step+1);  // for Left move
		maze[r][c] = true; // this is used for backtracking
		path[r][c] = 0;
	}

}