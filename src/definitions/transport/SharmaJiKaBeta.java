/*   Created by IntelliJ IDEA.
 *   Author: Abhishek Singh Tomar (AbhishekSinghTomar19)
 *   Date: 27-08-2020
 *   Time: 13:05
 *   File: SharmaJiKaBeta.java
 */

package definitions.transport;

import java.util.Objects;

public class SharmaJiKaBeta extends SharmaJi {
    private String extrachaplusi;

    public SharmaJiKaBeta(String extrachaplusi) {
        this.extrachaplusi = extrachaplusi;
    }

    public String getExtrachaplusi() {
        return extrachaplusi;
    }

    public void setExtrachaplusi(String extrachaplusi) {
        this.extrachaplusi = extrachaplusi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SharmaJiKaBeta that = (SharmaJiKaBeta) o;
        return Objects.equals(getExtrachaplusi(), that.getExtrachaplusi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExtrachaplusi());
    }

    public void chaplusi(String extraChaplusi) {
        System.out.println("Same jati k hi toh h bhai !");
    }
}

