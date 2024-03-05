import React, { useState, useEffect } from 'react';
import './App.css';
import News from './News';

function App() {
  const [articles, setArticles] = useState([]);

  useEffect(() => {
    fetch('https://newsapi.org/v2/top-headlines?country=us&apiKey=4cc92de37cc846599a565a4a78410de0')
      .then(response => response.json())
      .then(data => setArticles(data.articles))
      .catch(error => console.log(error));
  }, []);

  return (
    <div className="App">
      <h1>Latest News</h1>
      <div className="news-container">
        {articles.map((article, index) => (
          <News key={index} article={article} />
        ))}
      </div>
    </div>
  );
}

export default App;
