<?php
    echo "<table border = '2px black' style = 'border-collapse: collapse'>";

    for($row = 1; $row <= 8; $row++)
    {
        echo '<tr>';
        for($col = 1; $col <= 8; $col++)
        {
            if(($row+$col)%2==0)6y,./
                                      
            
            {
                echo "<td height = '100px' width = '100px' bgcolor = 'black'></td>";
            }
            else
            {
                echo "<td height = '100px' width = '100px' bgcolor = 'white'></td>";

            }
        }
    }
?>