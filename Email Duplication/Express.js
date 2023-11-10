app.post('/emailValidation', (req, res) => 
{
    var email = req.body.email;
    let sql = 'SELECT count(*) as count FROM email WHERE email = ?';
    let query = db.query(sql, [email],(err, result) => {
      if (result[0].count == 1) 
      {
        // If the count is 1, the email address already exists in the database
        res.json({
          "data": "valid"
        })
      } 
      else 
      {
        // If the count is not 1, the email address does not exist in the database
        res.json({
          "data": "invalid"

        })
      }
    });
});