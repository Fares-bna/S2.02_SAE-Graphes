package adaptator;

import graph.Graph;
import maze.Maze;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class GraphMaze<C> implements Graph<C> {
    private final Maze<C> maze;

    public GraphMaze(Maze<C> maze) {
        this.maze = maze;
    }

    @Override
    public List<Arc<C>> getSucc(C sommet) {
        return maze.openedNeighbours(sommet).stream()
                .map(neighbor -> new Arc<>(1, neighbor))
                .toList();
    }

}


